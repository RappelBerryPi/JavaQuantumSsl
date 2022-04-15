package com.thatsdarlingmama;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.stream.Stream;

import javax.crypto.KeyAgreement;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openquantumsafe.KEMs;
import org.openquantumsafe.Sigs;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private static ArrayList<String> signatures;
    private static ArrayList<String> keyEncapsulationMechanisms;

    @BeforeAll
    public static void init() {
        signatures = Sigs.get_supported_sigs();
        keyEncapsulationMechanisms = KEMs.get_enabled_KEMs();
    }

    @ParameterizedTest
    @MethodSource("getSigs")
    public void TestAllSignatures(String signatureType) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(signatureType);

        Signature signature = Signature.getInstance(signatureType);
        Signature signature2 = Signature.getInstance(signatureType);
        
        signature.initSign(keyPairGenerator.generateKeyPair().getPrivate());
        signature2.initSign(keyPairGenerator.generateKeyPair().getPrivate());
        signature.update("Hello World!".getBytes());
        signature2.update("Hello World!".getBytes());
        byte[] bytes = signature.sign();

        signature2.initVerify(keyPairGenerator.generateKeyPair().getPublic());
        assertTrue(signature2.verify(bytes));
    }

    @ParameterizedTest
    @MethodSource("getKEMs")
    public void TestAllKeyEncapsulationMechanisms(String keyEncapsulationMechanism) throws InvalidKeyException, NoSuchAlgorithmException {
        KeyPairGenerator clientGenerator = KeyPairGenerator.getInstance(keyEncapsulationMechanism);
        KeyPairGenerator serverGenerator = KeyPairGenerator.getInstance(keyEncapsulationMechanism);
        KeyAgreement client = KeyAgreement.getInstance(keyEncapsulationMechanism);
        KeyAgreement server = KeyAgreement.getInstance(keyEncapsulationMechanism);

        /* normal process */
        client.init(clientGenerator.generateKeyPair().getPrivate());
        server.init(serverGenerator.generateKeyPair().getPrivate());
        client.doPhase(serverGenerator.generateKeyPair().getPublic(), false);
        server.doPhase(clientGenerator.generateKeyPair().getPublic(), false);
        byte[] cipherText  = client.generateSecret();
        byte[] cipherText2 = server.generateSecret();
        /* end normal process */

        Key key = client.doPhase(WrapBytes(cipherText2), true);
        Key key2 = server.doPhase(WrapBytes(cipherText), true);

        byte[] broken = Base64.getDecoder().decode(key.getFormat());
        byte[] broken2 = Base64.getDecoder().decode(key2.getFormat());
        assertArrayEquals(broken2, key.getEncoded());
        //assertArrayEquals(broken, key2.getEncoded());
    }

    private static Key WrapBytes(byte[] cipherText) {
        return new Key() {

            @Override
            public String getAlgorithm() { return null; }

            @Override
            public byte[] getEncoded() {
                return cipherText;
            }

            @Override
            public String getFormat() { return null; }
            
        };
    }
    
    private static Stream<String> getSigs() {
        return signatures.stream().filter(s -> !(s.startsWith("Rainbow-II") || s.startsWith("Rainbow-V")));
    }

    private static Stream<String> getKEMs() {
        return keyEncapsulationMechanisms.parallelStream()
                .filter(s -> !(s.startsWith("Classic-McEliece")));
    }
}

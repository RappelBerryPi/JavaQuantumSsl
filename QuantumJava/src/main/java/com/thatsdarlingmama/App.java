package com.thatsdarlingmama;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.KeyAgreement;

import com.thatsdarlingmama.nat.LeanCryptoNative;

import javax.crypto.KEM;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws SignatureException, InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException {
        /*
        String signatureType = "Dilithium5";
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(signatureType);

        Signature signature = Signature.getInstance(signatureType);
        Signature signature2 = Signature.getInstance(signatureType);
        
        signature.initSign(keyPairGenerator.generateKeyPair().getPrivate());
        signature2.initSign(keyPairGenerator.generateKeyPair().getPrivate());
        signature.update("Hello World!".getBytes());
        signature2.update("Hello World!".getBytes());
        byte[] bytes = signature.sign();

        signature2.initVerify(keyPairGenerator.generateKeyPair().getPublic());
        System.out.println(signature2.verify(bytes));
        */

        /*
        String KeyEncapsulationMechanism = "Kyber1024";
        KeyPairGenerator clientGenerator = KeyPairGenerator.getInstance(KeyEncapsulationMechanism);
        KeyPairGenerator serverGenerator = KeyPairGenerator.getInstance(KeyEncapsulationMechanism);
        KeyAgreement client = KeyAgreement.getInstance(KeyEncapsulationMechanism);
        KeyAgreement server = KeyAgreement.getInstance(KeyEncapsulationMechanism);

        /* normal process
        client.init(clientGenerator.generateKeyPair().getPrivate());
        server.init(serverGenerator.generateKeyPair().getPrivate());
        //client.doPhase(serverGenerator.generateKeyPair().getPublic(), false);
        server.doPhase(clientGenerator.generateKeyPair().getPublic(), false);
        //byte[] cipherText  = client.generateSecret();
        byte[] cipherText = server.generateSecret();
        /* end normal process

        Key key = client.doPhase(WrapBytes(cipherText), true);
        System.out.println(Base64.getEncoder().encodeToString(key.getEncoded()));
        */
        KeyPair keyPair = LeanCryptoNative.GetKeyPair(null);
        

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
}

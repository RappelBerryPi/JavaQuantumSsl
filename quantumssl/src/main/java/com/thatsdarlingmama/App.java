package com.thatsdarlingmama;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;

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
        KeyPairGenerator keyAgreementGenerator = KeyPairGenerator.getInstance("Kyber1024");
        KeyPairGenerator keyAgreementGenerator2 = KeyPairGenerator.getInstance("Kyber1024");
        KeyAgreement keyAgreement = KeyAgreement.getInstance("Kyber1024");
        KeyAgreement keyAgreement2 = KeyAgreement.getInstance("Kyber1024");

        keyAgreement.init(keyAgreementGenerator.generateKeyPair().getPrivate());
        keyAgreement2.init(keyAgreementGenerator2.generateKeyPair().getPrivate());
        keyAgreement.doPhase(keyAgreementGenerator2.generateKeyPair().getPublic(), false);
        keyAgreement2.doPhase(keyAgreementGenerator.generateKeyPair().getPublic(), false);
        byte[] cipherText  = keyAgreement.generateSecret();
        byte[] cipherText2 = keyAgreement2.generateSecret();

        Key key = keyAgreement.doPhase(WrapBytes(cipherText2), true);
        Key key2 = keyAgreement2.doPhase(WrapBytes(cipherText), true);

        byte[] broken = Base64.getDecoder().decode(key.getFormat());
        byte[] broken2 = Base64.getDecoder().decode(key2.getFormat());
        System.out.println(Arrays.equals(broken2, key.getEncoded()));
        System.out.println(Arrays.equals(broken, key2.getEncoded()));
        */

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

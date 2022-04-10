package com.thatsdarlingmama;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.util.Base64;

import com.thatsdarlingmama.signature.Dilithium;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws SignatureException, InvalidKeyException {
        System.out.println("Hello World!");
        Dilithium spi = new Dilithium();
        byte[] privateKeyBytes = spi.getPrivateKey();
        PrivateKey privateKey = new PrivateKey() {
            @Override
            public String getAlgorithm() {
                return null;
            }

            @Override
            public String getFormat() {
                return null;
            }

            @Override
            public byte[] getEncoded() {
                return privateKeyBytes;
            }
        };
        spi.initSign(privateKey);
        spi.update("Hello World!".getBytes(), 0, 0);
        byte[] bytes = spi.sign();
        System.out.println(Base64.getEncoder().encodeToString(bytes));
        PublicKey publicKey = new PublicKey() {
            @Override
            public String getAlgorithm() {
                return null;
            }

            @Override
            public String getFormat() {
                return null;
            }

            @Override
            public byte[] getEncoded() {
                return spi.getPublicKey();
            }
        };
        spi.initVerify(publicKey);
        boolean isValid = spi.verify(bytes);
        System.out.println(isValid);
    }
}

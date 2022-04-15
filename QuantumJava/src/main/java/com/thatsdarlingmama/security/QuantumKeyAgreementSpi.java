package com.thatsdarlingmama.security;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Base64;

import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;

import org.openquantumsafe.KeyEncapsulation;
import org.openquantumsafe.Pair;

public class QuantumKeyAgreementSpi extends KeyAgreementSpi {
    private String kemType;
    private KeyEncapsulation kem;
    private Key otherKey;
    private byte[] cipherText;
    private byte[] sharedSecret;

    
    public QuantumKeyAgreementSpi(String kemType) {
        this.kemType = kemType;
        this.kem = new KeyEncapsulation(kemType);
        kem.generate_keypair();
        kem.export_secret_key();
    }

    @Override
    protected Key engineDoPhase(Key arg0, boolean lastStep) throws InvalidKeyException, IllegalStateException {
        if (!lastStep) {
            this.otherKey = arg0;
            return null;
        } else {
            var cipherText = arg0.getEncoded();
            byte[] otherSharedSecret = this.DecapsulateSecret(cipherText);
            return new Key() {

                @Override
                public String getAlgorithm() { return null; }

                @Override
                public byte[] getEncoded() {
                    return otherSharedSecret;
                }

                @Override
                public String getFormat() { return Base64.getEncoder().encodeToString(sharedSecret); }
            };
        }
    }

    @Override
    protected byte[] engineGenerateSecret() throws IllegalStateException {
        Pair<byte[], byte[]> pair = this.kem.encap_secret(this.otherKey.getEncoded());
        this.cipherText = pair.getLeft();
        this.sharedSecret = pair.getRight();
        System.out.println(Base64.getEncoder().encodeToString(sharedSecret));
        return this.cipherText;
    }

    @Override
    protected SecretKey engineGenerateSecret(String arg0)
            throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        throw new NoSuchAlgorithmException();
    }

    @Override
    protected int engineGenerateSecret(byte[] arg0, int arg1) throws IllegalStateException, ShortBufferException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    protected void engineInit(Key arg0, SecureRandom arg1) throws InvalidKeyException {
        this.kem = new KeyEncapsulation(kemType, arg0.getEncoded());
    }

    @Override
    protected void engineInit(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2)
            throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException();
    }

    public byte[] DecapsulateSecret(byte[] cipherText) {
        return kem.decap_secret(cipherText);
    }
    
}

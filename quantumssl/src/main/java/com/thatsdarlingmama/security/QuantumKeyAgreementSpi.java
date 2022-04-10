package com.thatsdarlingmama.security;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
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
        } else {
            byte[] brokenSecret = BreakSecret(arg0.getEncoded());
            String format = Base64.getEncoder().encodeToString(this.sharedSecret);
            return new Key() {

                @Override
                public String getAlgorithm() {
                    // TODO Auto-generated method stub
                    return null;
                }

                @Override
                public byte[] getEncoded() {
                    return brokenSecret;
                }

                @Override
                public String getFormat() {
                    return format;
                }
                
            };
        }
        return null;
    }

    @Override
    protected byte[] engineGenerateSecret() throws IllegalStateException {
        Pair<byte[], byte[]> pair = this.kem.encap_secret(this.otherKey.getEncoded());
        this.cipherText = pair.getLeft();
        this.sharedSecret = pair.getRight();
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

    public void init(Key arg0) throws InvalidKeyException {
        this.engineInit(arg0, null);
    }
    public void doPhase(Key key, boolean arg1) throws InvalidKeyException, IllegalStateException {
        this.engineDoPhase(key, arg1);
    }
    public byte[] generateSecret() {
        return this.engineGenerateSecret();
    }

    public PublicKey getPublicKey() {
        byte[] publicKey = kem.export_public_key();
        return new PublicKey() {

            @Override
            public String getAlgorithm() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public byte[] getEncoded() {
                return publicKey;
            }

            @Override
            public String getFormat() {
                // TODO Auto-generated method stub
                return null;
            }
            
        };
    }

    public PrivateKey getPrivateKey() {
        byte[] privateKey = kem.export_secret_key();
        return new PrivateKey() {

            @Override
            public String getAlgorithm() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public byte[] getEncoded() {
                return privateKey;
            }

            @Override
            public String getFormat() {
                // TODO Auto-generated method stub
                return null;
            }
            
        };
    }
    public byte[] getCipherText() {
        return cipherText;
    }
    public byte[] BreakSecret(byte[] cipherText) {
        return kem.decap_secret(cipherText);
    }
    
}

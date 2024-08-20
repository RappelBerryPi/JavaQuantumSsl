/*
package com.thatsdarlingmama.security;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGeneratorSpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;

import org.openquantumsafe.KEMs;
import org.openquantumsafe.KeyEncapsulation;
import org.openquantumsafe.Signature;
import org.openquantumsafe.Sigs;

public class QuantumKeyPairGeneratorSpi extends KeyPairGeneratorSpi{
    private KeyEncapsulation keyEncapsulation;
    private Signature signature;
    private PublicKey publicKey;
    private byte[] publicKeyBytes;
    private PrivateKey privateKey;
    private byte[] privateKeyBytes;

    public QuantumKeyPairGeneratorSpi(String quantumKeyPairGeneratorType) throws InvalidAlgorithmParameterException {
        publicKey = null;
        privateKey = null;
        if (Sigs.is_sig_supported(quantumKeyPairGeneratorType) && Sigs.is_sig_enabled(quantumKeyPairGeneratorType)) {
            keyEncapsulation = null;
            signature = new Signature(quantumKeyPairGeneratorType);
            publicKeyBytes = signature.generate_keypair();
            privateKeyBytes = signature.export_secret_key();
        } else if (KEMs.is_KEM_supported(quantumKeyPairGeneratorType) && KEMs.is_KEM_enabled(quantumKeyPairGeneratorType)) {
            signature = null;
            keyEncapsulation = new KeyEncapsulation(quantumKeyPairGeneratorType);
            publicKeyBytes = keyEncapsulation.generate_keypair();
            privateKeyBytes = keyEncapsulation.export_secret_key();
        } else {
            throw new InvalidAlgorithmParameterException("Unknown Quantum Cryptography type " + quantumKeyPairGeneratorType);
        }
    }

    @Override
    public KeyPair generateKeyPair() {
        if (privateKey == null) {
            privateKey = new PrivateKey() {

                @Override
                public String getAlgorithm() { return null; }

                @Override
                public byte[] getEncoded() {
                    return privateKeyBytes;
                }

                @Override
                public String getFormat() { return null; }
            };
        }
        if (publicKey == null) {
            publicKey = new PublicKey() {

                @Override
                public String getAlgorithm() { return null; }

                @Override
                public byte[] getEncoded() {
                    return publicKeyBytes;
                }

                @Override
                public String getFormat() { return null; }
            };
        }
        KeyPair pair = new KeyPair(publicKey, privateKey);
        return pair;
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        try {
            throw new InvalidAlgorithmParameterException();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
    }
    
}

 */
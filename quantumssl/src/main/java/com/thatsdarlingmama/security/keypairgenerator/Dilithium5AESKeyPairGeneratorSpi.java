package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Dilithium5AESKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Dilithium5AESKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Dilithium5-AES");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Dilithium3AESKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Dilithium3AESKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Dilithium3-AES");
    }
}

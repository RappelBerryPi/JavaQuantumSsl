package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Dilithium3KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Dilithium3KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Dilithium3");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Dilithium5KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Dilithium5KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Dilithium5");
    }
}

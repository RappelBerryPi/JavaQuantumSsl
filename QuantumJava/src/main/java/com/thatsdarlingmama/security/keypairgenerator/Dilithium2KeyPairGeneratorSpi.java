package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Dilithium2KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Dilithium2KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Dilithium2");
    }
}

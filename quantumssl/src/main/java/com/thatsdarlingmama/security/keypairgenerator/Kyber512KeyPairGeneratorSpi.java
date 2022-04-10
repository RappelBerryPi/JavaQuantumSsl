package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Kyber512KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Kyber512KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Kyber512");
    }
}

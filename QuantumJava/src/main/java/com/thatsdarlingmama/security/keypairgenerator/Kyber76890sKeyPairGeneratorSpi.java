package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Kyber76890sKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Kyber76890sKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Kyber768-90s");
    }
}

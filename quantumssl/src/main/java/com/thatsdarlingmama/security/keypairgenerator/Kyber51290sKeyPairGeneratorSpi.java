package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Kyber51290sKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Kyber51290sKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Kyber512-90s");
    }
}

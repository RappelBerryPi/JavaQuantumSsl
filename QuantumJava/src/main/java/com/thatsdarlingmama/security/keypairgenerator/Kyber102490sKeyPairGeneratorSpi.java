package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Kyber102490sKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Kyber102490sKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Kyber1024-90s");
    }
}

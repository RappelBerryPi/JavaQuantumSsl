package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Kyber768KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Kyber768KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Kyber768");
    }
}

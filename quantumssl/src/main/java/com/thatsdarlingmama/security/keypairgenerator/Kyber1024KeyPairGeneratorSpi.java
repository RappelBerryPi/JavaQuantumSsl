package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Kyber1024KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Kyber1024KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Kyber1024");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Falcon512KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Falcon512KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Falcon-512");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Falcon1024KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Falcon1024KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Falcon-1024");
    }
}

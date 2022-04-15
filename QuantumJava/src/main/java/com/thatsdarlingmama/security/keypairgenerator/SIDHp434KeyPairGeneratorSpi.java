package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIDHp434KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIDHp434KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIDH-p434");
    }
}

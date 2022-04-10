package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIDHp610KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIDHp610KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIDH-p610");
    }
}

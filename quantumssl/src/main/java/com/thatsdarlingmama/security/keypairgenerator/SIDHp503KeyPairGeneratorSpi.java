package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIDHp503KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIDHp503KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIDH-p503");
    }
}

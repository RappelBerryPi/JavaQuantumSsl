package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIDHp751KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIDHp751KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIDH-p751");
    }
}

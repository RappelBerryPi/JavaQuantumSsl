package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIKEp503KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIKEp503KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIKE-p503");
    }
}

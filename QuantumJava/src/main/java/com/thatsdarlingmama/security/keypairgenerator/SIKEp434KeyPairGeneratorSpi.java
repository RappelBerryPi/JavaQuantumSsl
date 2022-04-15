package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIKEp434KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIKEp434KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIKE-p434");
    }
}

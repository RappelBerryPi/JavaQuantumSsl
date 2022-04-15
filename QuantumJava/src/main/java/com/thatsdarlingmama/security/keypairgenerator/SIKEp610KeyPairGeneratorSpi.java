package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIKEp610KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIKEp610KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIKE-p610");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIKEp751KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIKEp751KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIKE-p751");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class HQC128KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public HQC128KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("HQC-128");
    }
}

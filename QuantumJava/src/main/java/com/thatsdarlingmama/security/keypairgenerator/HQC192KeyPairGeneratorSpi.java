package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class HQC192KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public HQC192KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("HQC-192");
    }
}

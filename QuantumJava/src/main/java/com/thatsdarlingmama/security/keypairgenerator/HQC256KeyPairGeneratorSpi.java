package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class HQC256KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public HQC256KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("HQC-256");
    }
}

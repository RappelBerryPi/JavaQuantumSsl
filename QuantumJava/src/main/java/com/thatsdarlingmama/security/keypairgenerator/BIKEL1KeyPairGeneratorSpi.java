package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class BIKEL1KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public BIKEL1KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("BIKE-L1");
    }
}

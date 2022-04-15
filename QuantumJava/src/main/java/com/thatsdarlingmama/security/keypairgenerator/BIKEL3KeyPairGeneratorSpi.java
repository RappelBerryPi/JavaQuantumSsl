package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class BIKEL3KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public BIKEL3KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("BIKE-L3");
    }
}

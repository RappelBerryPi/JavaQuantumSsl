package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class sntrup761KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public sntrup761KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("sntrup761");
    }
}

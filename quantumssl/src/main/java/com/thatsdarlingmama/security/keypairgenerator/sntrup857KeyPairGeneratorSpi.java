package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class sntrup857KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public sntrup857KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("sntrup857");
    }
}

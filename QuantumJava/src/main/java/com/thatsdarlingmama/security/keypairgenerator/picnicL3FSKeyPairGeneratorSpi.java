package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class picnicL3FSKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public picnicL3FSKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("picnic_L3_FS");
    }
}

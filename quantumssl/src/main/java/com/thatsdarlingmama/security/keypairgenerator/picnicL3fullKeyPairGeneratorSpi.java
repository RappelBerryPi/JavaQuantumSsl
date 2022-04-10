package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class picnicL3fullKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public picnicL3fullKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("picnic_L3_full");
    }
}

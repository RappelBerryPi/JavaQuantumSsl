package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class picnicL1fullKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public picnicL1fullKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("picnic_L1_full");
    }
}

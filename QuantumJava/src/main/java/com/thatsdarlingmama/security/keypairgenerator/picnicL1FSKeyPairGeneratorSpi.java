package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class picnicL1FSKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public picnicL1FSKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("picnic_L1_FS");
    }
}

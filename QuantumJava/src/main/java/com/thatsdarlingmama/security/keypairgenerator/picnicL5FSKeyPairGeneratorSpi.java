package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class picnicL5FSKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public picnicL5FSKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("picnic_L5_FS");
    }
}

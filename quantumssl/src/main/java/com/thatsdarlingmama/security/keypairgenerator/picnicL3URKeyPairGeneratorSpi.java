package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class picnicL3URKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public picnicL3URKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("picnic_L3_UR");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class picnicL5URKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public picnicL5URKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("picnic_L5_UR");
    }
}

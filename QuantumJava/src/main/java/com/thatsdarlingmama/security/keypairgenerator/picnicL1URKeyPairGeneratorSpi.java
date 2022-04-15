package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class picnicL1URKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public picnicL1URKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("picnic_L1_UR");
    }
}

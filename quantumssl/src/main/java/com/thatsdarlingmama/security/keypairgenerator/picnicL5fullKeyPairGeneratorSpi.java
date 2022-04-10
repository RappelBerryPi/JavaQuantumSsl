package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class picnicL5fullKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public picnicL5fullKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("picnic_L5_full");
    }
}

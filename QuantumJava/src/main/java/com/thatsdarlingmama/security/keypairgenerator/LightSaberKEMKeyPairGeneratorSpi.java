package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class LightSaberKEMKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public LightSaberKEMKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("LightSaber-KEM");
    }
}

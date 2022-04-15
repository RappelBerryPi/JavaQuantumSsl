package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class FireSaberKEMKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public FireSaberKEMKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("FireSaber-KEM");
    }
}

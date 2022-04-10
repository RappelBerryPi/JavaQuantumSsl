package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SaberKEMKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SaberKEMKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Saber-KEM");
    }
}

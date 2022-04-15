package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class ClassicMcEliece6960119fKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public ClassicMcEliece6960119fKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Classic-McEliece-6960119f");
    }
}

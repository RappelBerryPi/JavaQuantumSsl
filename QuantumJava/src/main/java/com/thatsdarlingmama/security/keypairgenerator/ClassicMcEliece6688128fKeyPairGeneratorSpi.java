package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class ClassicMcEliece6688128fKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public ClassicMcEliece6688128fKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Classic-McEliece-6688128f");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class ClassicMcEliece348864fKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public ClassicMcEliece348864fKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Classic-McEliece-348864f");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class ClassicMcEliece348864KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public ClassicMcEliece348864KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Classic-McEliece-348864");
    }
}

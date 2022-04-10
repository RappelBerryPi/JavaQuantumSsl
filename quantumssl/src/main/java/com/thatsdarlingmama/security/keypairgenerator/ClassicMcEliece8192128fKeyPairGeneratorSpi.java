package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class ClassicMcEliece8192128fKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public ClassicMcEliece8192128fKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Classic-McEliece-8192128f");
    }
}

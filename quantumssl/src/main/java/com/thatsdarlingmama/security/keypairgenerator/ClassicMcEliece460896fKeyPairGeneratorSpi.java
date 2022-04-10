package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class ClassicMcEliece460896fKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public ClassicMcEliece460896fKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Classic-McEliece-460896f");
    }
}

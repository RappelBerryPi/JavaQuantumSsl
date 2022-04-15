package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class ClassicMcEliece460896KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public ClassicMcEliece460896KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Classic-McEliece-460896");
    }
}

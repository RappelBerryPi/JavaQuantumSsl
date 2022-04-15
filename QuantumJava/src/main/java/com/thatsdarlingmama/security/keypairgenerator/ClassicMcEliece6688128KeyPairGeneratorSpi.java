package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class ClassicMcEliece6688128KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public ClassicMcEliece6688128KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Classic-McEliece-6688128");
    }
}

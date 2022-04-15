package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class ClassicMcEliece8192128KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public ClassicMcEliece8192128KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Classic-McEliece-8192128");
    }
}

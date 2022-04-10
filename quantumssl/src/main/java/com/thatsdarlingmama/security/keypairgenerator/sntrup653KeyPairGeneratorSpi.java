package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class sntrup653KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public sntrup653KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("sntrup653");
    }
}

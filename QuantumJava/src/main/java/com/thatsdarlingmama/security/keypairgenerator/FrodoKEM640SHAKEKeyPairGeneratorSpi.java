package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class FrodoKEM640SHAKEKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public FrodoKEM640SHAKEKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("FrodoKEM-640-SHAKE");
    }
}

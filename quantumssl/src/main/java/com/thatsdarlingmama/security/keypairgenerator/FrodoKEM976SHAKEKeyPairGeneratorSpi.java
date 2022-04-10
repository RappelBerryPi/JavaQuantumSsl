package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class FrodoKEM976SHAKEKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public FrodoKEM976SHAKEKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("FrodoKEM-976-SHAKE");
    }
}

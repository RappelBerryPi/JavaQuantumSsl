package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class FrodoKEM1344SHAKEKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public FrodoKEM1344SHAKEKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("FrodoKEM-1344-SHAKE");
    }
}

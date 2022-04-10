package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class FrodoKEM640AESKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public FrodoKEM640AESKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("FrodoKEM-640-AES");
    }
}

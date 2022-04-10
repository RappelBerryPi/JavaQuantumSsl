package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class FrodoKEM976AESKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public FrodoKEM976AESKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("FrodoKEM-976-AES");
    }
}

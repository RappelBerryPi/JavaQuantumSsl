package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class FrodoKEM1344AESKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public FrodoKEM1344AESKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("FrodoKEM-1344-AES");
    }
}

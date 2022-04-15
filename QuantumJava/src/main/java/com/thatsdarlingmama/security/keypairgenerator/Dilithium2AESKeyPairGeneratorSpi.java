package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class Dilithium2AESKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public Dilithium2AESKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Dilithium2-AES");
    }
}

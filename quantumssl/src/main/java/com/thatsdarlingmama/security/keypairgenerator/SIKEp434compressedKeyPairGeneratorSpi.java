package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIKEp434compressedKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIKEp434compressedKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIKE-p434-compressed");
    }
}

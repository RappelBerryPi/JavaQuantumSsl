package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIKEp610compressedKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIKEp610compressedKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIKE-p610-compressed");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIKEp503compressedKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIKEp503compressedKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIKE-p503-compressed");
    }
}

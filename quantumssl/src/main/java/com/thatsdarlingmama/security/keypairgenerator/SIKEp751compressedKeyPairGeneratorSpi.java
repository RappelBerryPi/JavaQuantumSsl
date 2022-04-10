package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIKEp751compressedKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIKEp751compressedKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIKE-p751-compressed");
    }
}

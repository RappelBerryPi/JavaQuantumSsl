package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIDHp751compressedKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIDHp751compressedKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIDH-p751-compressed");
    }
}

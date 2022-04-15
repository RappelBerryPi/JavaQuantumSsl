package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIDHp503compressedKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIDHp503compressedKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIDH-p503-compressed");
    }
}

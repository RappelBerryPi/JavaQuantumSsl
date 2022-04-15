package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIDHp434compressedKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIDHp434compressedKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIDH-p434-compressed");
    }
}

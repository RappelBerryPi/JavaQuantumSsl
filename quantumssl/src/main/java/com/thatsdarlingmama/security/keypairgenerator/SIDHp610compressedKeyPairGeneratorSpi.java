package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SIDHp610compressedKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SIDHp610compressedKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SIDH-p610-compressed");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class RainbowICompressedKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public RainbowICompressedKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Rainbow-I-Compressed");
    }
}

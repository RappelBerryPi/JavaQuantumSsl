package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class RainbowIIICompressedKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public RainbowIIICompressedKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Rainbow-III-Compressed");
    }
}

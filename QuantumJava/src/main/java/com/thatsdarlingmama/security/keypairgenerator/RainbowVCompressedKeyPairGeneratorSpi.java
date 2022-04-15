package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class RainbowVCompressedKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public RainbowVCompressedKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Rainbow-V-Compressed");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class RainbowVClassicKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public RainbowVClassicKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Rainbow-V-Classic");
    }
}

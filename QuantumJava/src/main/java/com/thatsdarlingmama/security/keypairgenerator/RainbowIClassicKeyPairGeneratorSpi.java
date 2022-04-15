package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class RainbowIClassicKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public RainbowIClassicKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Rainbow-I-Classic");
    }
}

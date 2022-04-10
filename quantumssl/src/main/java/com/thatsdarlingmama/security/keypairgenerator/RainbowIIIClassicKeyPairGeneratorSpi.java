package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class RainbowIIIClassicKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public RainbowIIIClassicKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("Rainbow-III-Classic");
    }
}

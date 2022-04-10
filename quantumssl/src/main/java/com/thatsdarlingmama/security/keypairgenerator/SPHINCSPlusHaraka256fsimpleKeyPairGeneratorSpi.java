package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SPHINCSPlusHaraka256fsimpleKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SPHINCSPlusHaraka256fsimpleKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SPHINCS+-Haraka-256f-simple");
    }
}

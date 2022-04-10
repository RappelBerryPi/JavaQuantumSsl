package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SPHINCSPlusHaraka256srobustKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SPHINCSPlusHaraka256srobustKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SPHINCS+-Haraka-256s-robust");
    }
}

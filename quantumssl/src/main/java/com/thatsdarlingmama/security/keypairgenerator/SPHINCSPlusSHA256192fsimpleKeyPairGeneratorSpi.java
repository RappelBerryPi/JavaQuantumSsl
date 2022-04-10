package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SPHINCSPlusSHA256192fsimpleKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SPHINCSPlusSHA256192fsimpleKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SPHINCS+-SHA256-192f-simple");
    }
}

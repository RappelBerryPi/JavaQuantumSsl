package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SPHINCSPlusSHA256192ssimpleKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SPHINCSPlusSHA256192ssimpleKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SPHINCS+-SHA256-192s-simple");
    }
}

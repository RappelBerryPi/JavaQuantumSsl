package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SPHINCSPlusSHA256128frobustKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SPHINCSPlusSHA256128frobustKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SPHINCS+-SHA256-128f-robust");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SPHINCSPlusSHAKE256256fsimpleKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SPHINCSPlusSHAKE256256fsimpleKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SPHINCS+-SHAKE256-256f-simple");
    }
}

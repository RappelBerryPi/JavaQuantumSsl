package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class SPHINCSPlusSHAKE256128srobustKeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public SPHINCSPlusSHAKE256128srobustKeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("SPHINCS+-SHAKE256-128s-robust");
    }
}

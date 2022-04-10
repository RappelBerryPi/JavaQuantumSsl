package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class sntrup1277KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public sntrup1277KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("sntrup1277");
    }
}

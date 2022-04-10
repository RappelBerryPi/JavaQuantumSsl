package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class NTRUHRSS701KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public NTRUHRSS701KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("NTRU-HRSS-701");
    }
}

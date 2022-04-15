package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class NTRUHRSS1373KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public NTRUHRSS1373KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("NTRU-HRSS-1373");
    }
}

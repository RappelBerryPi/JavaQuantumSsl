package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class NTRUHPS2048509KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public NTRUHPS2048509KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("NTRU-HPS-2048-509");
    }
}

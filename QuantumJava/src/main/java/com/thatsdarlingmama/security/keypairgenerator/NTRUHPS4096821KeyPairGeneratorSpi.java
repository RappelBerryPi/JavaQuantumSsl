package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class NTRUHPS4096821KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public NTRUHPS4096821KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("NTRU-HPS-4096-821");
    }
}

package com.thatsdarlingmama.security.keypairgenerator;

import java.security.InvalidAlgorithmParameterException;

import com.thatsdarlingmama.security.QuantumKeyPairGeneratorSpi;
public class NTRUHPS40961229KeyPairGeneratorSpi extends QuantumKeyPairGeneratorSpi {
    public NTRUHPS40961229KeyPairGeneratorSpi() throws InvalidAlgorithmParameterException {
        super("NTRU-HPS-4096-1229");
    }
}

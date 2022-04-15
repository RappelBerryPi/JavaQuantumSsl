package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusHaraka192fsimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusHaraka192fsimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-Haraka-192f-simple");
    }
}

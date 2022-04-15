package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusHaraka192ssimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusHaraka192ssimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-Haraka-192s-simple");
    }
}

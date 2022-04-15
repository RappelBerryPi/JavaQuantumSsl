package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusHaraka128ssimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusHaraka128ssimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-Haraka-128s-simple");
    }
}

package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusHaraka256fsimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusHaraka256fsimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-Haraka-256f-simple");
    }
}

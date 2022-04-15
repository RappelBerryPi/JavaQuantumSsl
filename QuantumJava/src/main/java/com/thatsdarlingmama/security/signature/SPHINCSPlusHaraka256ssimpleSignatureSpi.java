package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusHaraka256ssimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusHaraka256ssimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-Haraka-256s-simple");
    }
}

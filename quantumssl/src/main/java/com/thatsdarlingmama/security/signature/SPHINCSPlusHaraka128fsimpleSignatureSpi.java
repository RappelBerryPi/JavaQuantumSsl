package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusHaraka128fsimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusHaraka128fsimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-Haraka-128f-simple");
    }
}

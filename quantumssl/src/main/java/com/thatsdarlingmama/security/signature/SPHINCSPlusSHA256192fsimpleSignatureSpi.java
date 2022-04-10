package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHA256192fsimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHA256192fsimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHA256-192f-simple");
    }
}

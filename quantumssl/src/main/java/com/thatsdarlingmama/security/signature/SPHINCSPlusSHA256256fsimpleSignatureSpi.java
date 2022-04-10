package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHA256256fsimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHA256256fsimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHA256-256f-simple");
    }
}

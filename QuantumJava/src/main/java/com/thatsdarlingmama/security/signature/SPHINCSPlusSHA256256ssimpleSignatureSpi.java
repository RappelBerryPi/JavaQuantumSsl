package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHA256256ssimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHA256256ssimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHA256-256s-simple");
    }
}

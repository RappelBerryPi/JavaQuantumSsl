package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHA256128ssimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHA256128ssimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHA256-128s-simple");
    }
}

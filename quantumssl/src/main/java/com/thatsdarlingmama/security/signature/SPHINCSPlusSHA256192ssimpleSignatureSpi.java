package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHA256192ssimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHA256192ssimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHA256-192s-simple");
    }
}

package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHA256128fsimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHA256128fsimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHA256-128f-simple");
    }
}

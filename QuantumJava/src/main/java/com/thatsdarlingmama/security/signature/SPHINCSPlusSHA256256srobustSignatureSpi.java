package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHA256256srobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHA256256srobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHA256-256s-robust");
    }
}

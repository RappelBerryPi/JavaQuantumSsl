package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHA256256frobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHA256256frobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHA256-256f-robust");
    }
}

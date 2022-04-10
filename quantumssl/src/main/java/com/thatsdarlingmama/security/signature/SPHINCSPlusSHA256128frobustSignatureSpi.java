package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHA256128frobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHA256128frobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHA256-128f-robust");
    }
}

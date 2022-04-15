package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHA256128srobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHA256128srobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHA256-128s-robust");
    }
}

package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHA256192srobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHA256192srobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHA256-192s-robust");
    }
}

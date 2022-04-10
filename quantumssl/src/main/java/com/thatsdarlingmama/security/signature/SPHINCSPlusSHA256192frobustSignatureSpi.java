package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHA256192frobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHA256192frobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHA256-192f-robust");
    }
}

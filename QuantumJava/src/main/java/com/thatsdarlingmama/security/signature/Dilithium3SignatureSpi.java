package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class Dilithium3SignatureSpi extends QuantumSignatureSpi {
    public Dilithium3SignatureSpi() throws SignatureException {
        super("Dilithium3");
    }
}

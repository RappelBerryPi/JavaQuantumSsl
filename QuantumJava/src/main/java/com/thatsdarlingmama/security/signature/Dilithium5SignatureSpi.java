package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class Dilithium5SignatureSpi extends QuantumSignatureSpi {
    public Dilithium5SignatureSpi() throws SignatureException {
        super("Dilithium5");
    }
}

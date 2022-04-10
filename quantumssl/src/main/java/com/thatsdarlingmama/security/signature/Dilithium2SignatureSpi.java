package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class Dilithium2SignatureSpi extends QuantumSignatureSpi {
    public Dilithium2SignatureSpi() throws SignatureException {
        super("Dilithium2");
    }
}

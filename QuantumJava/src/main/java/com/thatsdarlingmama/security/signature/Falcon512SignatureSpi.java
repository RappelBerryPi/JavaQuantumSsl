package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class Falcon512SignatureSpi extends QuantumSignatureSpi {
    public Falcon512SignatureSpi() throws SignatureException {
        super("Falcon-512");
    }
}

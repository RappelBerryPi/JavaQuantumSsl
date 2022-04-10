package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class Falcon1024SignatureSpi extends QuantumSignatureSpi {
    public Falcon1024SignatureSpi() throws SignatureException {
        super("Falcon-1024");
    }
}

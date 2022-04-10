package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class Dilithium5AESSignatureSpi extends QuantumSignatureSpi {
    public Dilithium5AESSignatureSpi() throws SignatureException {
        super("Dilithium5-AES");
    }
}

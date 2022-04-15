package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class Dilithium3AESSignatureSpi extends QuantumSignatureSpi {
    public Dilithium3AESSignatureSpi() throws SignatureException {
        super("Dilithium3-AES");
    }
}

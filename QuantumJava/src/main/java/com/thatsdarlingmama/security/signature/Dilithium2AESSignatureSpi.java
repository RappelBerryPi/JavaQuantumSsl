package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class Dilithium2AESSignatureSpi extends QuantumSignatureSpi {
    public Dilithium2AESSignatureSpi() throws SignatureException {
        super("Dilithium2-AES");
    }
}

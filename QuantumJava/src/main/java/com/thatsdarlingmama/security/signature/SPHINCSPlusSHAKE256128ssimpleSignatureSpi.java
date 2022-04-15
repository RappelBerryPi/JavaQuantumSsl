package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHAKE256128ssimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHAKE256128ssimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHAKE256-128s-simple");
    }
}

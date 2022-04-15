package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHAKE256256ssimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHAKE256256ssimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHAKE256-256s-simple");
    }
}

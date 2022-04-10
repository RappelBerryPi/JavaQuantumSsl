package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHAKE256192fsimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHAKE256192fsimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHAKE256-192f-simple");
    }
}

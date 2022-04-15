package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHAKE256192ssimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHAKE256192ssimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHAKE256-192s-simple");
    }
}

package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHAKE256128fsimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHAKE256128fsimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHAKE256-128f-simple");
    }
}

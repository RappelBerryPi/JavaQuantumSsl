package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHAKE256256srobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHAKE256256srobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHAKE256-256s-robust");
    }
}

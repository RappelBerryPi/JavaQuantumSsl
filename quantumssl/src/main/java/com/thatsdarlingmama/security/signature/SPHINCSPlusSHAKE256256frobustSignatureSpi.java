package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHAKE256256frobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHAKE256256frobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHAKE256-256f-robust");
    }
}

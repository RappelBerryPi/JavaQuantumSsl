package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHAKE256128frobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHAKE256128frobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHAKE256-128f-robust");
    }
}

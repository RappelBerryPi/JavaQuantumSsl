package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHAKE256128srobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHAKE256128srobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHAKE256-128s-robust");
    }
}

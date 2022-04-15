package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHAKE256192frobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHAKE256192frobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHAKE256-192f-robust");
    }
}

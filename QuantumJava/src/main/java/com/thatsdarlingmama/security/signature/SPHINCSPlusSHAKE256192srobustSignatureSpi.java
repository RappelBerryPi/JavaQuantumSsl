package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHAKE256192srobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHAKE256192srobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHAKE256-192s-robust");
    }
}

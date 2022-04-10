package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusHaraka128srobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusHaraka128srobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-Haraka-128s-robust");
    }
}

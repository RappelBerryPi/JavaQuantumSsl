package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusHaraka128frobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusHaraka128frobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-Haraka-128f-robust");
    }
}

package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusHaraka256frobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusHaraka256frobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-Haraka-256f-robust");
    }
}

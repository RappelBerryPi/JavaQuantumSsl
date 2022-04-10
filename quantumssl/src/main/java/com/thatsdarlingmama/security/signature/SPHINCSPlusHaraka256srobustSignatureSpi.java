package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusHaraka256srobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusHaraka256srobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-Haraka-256s-robust");
    }
}

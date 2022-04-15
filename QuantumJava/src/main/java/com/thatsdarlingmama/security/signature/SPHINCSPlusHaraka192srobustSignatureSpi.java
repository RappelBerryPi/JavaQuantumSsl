package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusHaraka192srobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusHaraka192srobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-Haraka-192s-robust");
    }
}

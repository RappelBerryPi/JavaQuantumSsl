package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusHaraka192frobustSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusHaraka192frobustSignatureSpi() throws SignatureException {
        super("SPHINCS+-Haraka-192f-robust");
    }
}

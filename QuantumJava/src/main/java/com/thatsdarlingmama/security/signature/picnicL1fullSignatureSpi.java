package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class picnicL1fullSignatureSpi extends QuantumSignatureSpi {
    public picnicL1fullSignatureSpi() throws SignatureException {
        super("picnic_L1_full");
    }
}

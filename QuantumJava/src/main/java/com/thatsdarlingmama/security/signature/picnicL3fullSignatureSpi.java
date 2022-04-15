package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class picnicL3fullSignatureSpi extends QuantumSignatureSpi {
    public picnicL3fullSignatureSpi() throws SignatureException {
        super("picnic_L3_full");
    }
}

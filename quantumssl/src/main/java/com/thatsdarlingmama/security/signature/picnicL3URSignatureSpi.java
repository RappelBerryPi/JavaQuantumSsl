package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class picnicL3URSignatureSpi extends QuantumSignatureSpi {
    public picnicL3URSignatureSpi() throws SignatureException {
        super("picnic_L3_UR");
    }
}

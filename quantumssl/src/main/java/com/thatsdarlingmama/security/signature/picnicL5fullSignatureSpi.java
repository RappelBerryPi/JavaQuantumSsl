package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class picnicL5fullSignatureSpi extends QuantumSignatureSpi {
    public picnicL5fullSignatureSpi() throws SignatureException {
        super("picnic_L5_full");
    }
}

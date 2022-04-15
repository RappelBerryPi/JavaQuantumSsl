package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class picnicL1FSSignatureSpi extends QuantumSignatureSpi {
    public picnicL1FSSignatureSpi() throws SignatureException {
        super("picnic_L1_FS");
    }
}

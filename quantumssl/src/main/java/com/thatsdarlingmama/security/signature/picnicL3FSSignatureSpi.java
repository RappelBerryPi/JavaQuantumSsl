package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class picnicL3FSSignatureSpi extends QuantumSignatureSpi {
    public picnicL3FSSignatureSpi() throws SignatureException {
        super("picnic_L3_FS");
    }
}

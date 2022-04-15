package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class picnicL5FSSignatureSpi extends QuantumSignatureSpi {
    public picnicL5FSSignatureSpi() throws SignatureException {
        super("picnic_L5_FS");
    }
}

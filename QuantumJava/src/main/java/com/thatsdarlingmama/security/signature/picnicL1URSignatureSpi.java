package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class picnicL1URSignatureSpi extends QuantumSignatureSpi {
    public picnicL1URSignatureSpi() throws SignatureException {
        super("picnic_L1_UR");
    }
}

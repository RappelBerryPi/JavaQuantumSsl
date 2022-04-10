package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class RainbowVClassicSignatureSpi extends QuantumSignatureSpi {
    public RainbowVClassicSignatureSpi() throws SignatureException {
        super("Rainbow-V-Classic");
    }
}

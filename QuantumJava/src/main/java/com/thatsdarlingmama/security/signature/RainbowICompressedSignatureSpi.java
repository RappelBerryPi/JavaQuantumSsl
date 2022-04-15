package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class RainbowICompressedSignatureSpi extends QuantumSignatureSpi {
    public RainbowICompressedSignatureSpi() throws SignatureException {
        super("Rainbow-I-Compressed");
    }
}

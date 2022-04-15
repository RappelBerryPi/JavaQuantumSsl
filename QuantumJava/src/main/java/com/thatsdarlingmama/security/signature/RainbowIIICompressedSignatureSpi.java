package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class RainbowIIICompressedSignatureSpi extends QuantumSignatureSpi {
    public RainbowIIICompressedSignatureSpi() throws SignatureException {
        super("Rainbow-III-Compressed");
    }
}

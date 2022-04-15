package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class RainbowVCompressedSignatureSpi extends QuantumSignatureSpi {
    public RainbowVCompressedSignatureSpi() throws SignatureException {
        super("Rainbow-V-Compressed");
    }
}

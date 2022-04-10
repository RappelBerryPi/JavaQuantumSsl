package com.thatsdarlingmama.security.keyagreement;

import com.thatsdarlingmama.security.QuantumKeyAgreementSpi;
public class HQC256KeyAgreementSpi extends QuantumKeyAgreementSpi {
    public HQC256KeyAgreementSpi() {
        super("HQC-256");
    }
}

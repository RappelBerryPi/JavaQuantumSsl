package com.thatsdarlingmama.security;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;

import org.openquantumsafe.Signature;
import org.openquantumsafe.Sigs;

public class QuantumSignatureSpi extends SignatureSpi {
    private String quantumSignatureType;
    private Signature quantumSignature;
    private byte[] privateKey;
    private byte[] publicKey;
    private byte[] messageToSign;

    public QuantumSignatureSpi(String quantumSignatureType) throws SignatureException {
        if (!(Sigs.is_sig_supported(quantumSignatureType) && Sigs.is_sig_enabled(quantumSignatureType))) {
            throw new SignatureException("The Signature Type " + quantumSignatureType + " is not a supported quantum Signature Algorithm");
        }

        this.quantumSignatureType = quantumSignatureType;
        quantumSignature = new Signature(quantumSignatureType);
        this.publicKey = quantumSignature.generate_keypair();
        this.privateKey = quantumSignature.export_secret_key();
    }

    @Deprecated
    @Override
    /***
     * @deprecated
     * This method will only ever return null
     */
    protected Object engineGetParameter(String arg0) throws InvalidParameterException {
        return null;
    }

    @Override
    protected void engineInitSign(PrivateKey newPrivateKey) throws InvalidKeyException {
        this.quantumSignature = new Signature(quantumSignatureType, newPrivateKey.getEncoded());
        this.privateKey = newPrivateKey.getEncoded();
    }

    @Override
    protected void engineInitVerify(PublicKey newPublicKey) throws InvalidKeyException {
        this.publicKey = newPublicKey.getEncoded();
        
    }

    @Override
    @Deprecated
    protected void engineSetParameter(String arg0, Object arg1) throws InvalidParameterException {
        throw new InvalidParameterException();
    }

    @Override
    protected byte[] engineSign() throws SignatureException {
        byte[] returnValue = quantumSignature.sign(messageToSign);
        return returnValue;
    }

    @Override
    protected void engineUpdate(byte arg0) throws SignatureException {
        throw new SignatureException();
        
    }

    @Override
    protected void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        messageToSign= arg0;
    }

    @Override
    protected boolean engineVerify(byte[] arg0) throws SignatureException {
        return quantumSignature.verify(messageToSign, arg0, publicKey);
    }
    public boolean verify(byte[] arg0) throws SignatureException {
        return engineVerify(arg0);
    }
    public void update(byte[] arg0) throws SignatureException {
        this.engineUpdate(arg0, 0, 0);
    }
    public void initSign(PrivateKey privateKey) {
        this.privateKey = privateKey.getEncoded();
    }
    public byte[] sign() throws SignatureException {
        return this.engineSign();
    }

    public PrivateKey getPrivateKey() {
        PrivateKey pKey = new PrivateKey() {
            @Override
            public String getAlgorithm() {
                return null;
            }

            @Override
            public String getFormat() {
                return null;
            }

            @Override
            public byte[] getEncoded() {
                return privateKey;
            }
        };
        return pKey;
    }
    public PublicKey getPublicKey() {
        PublicKey pKey = new PublicKey() {
            @Override
            public String getAlgorithm() {
                return null;
            }

            @Override
            public String getFormat() {
                return null;
            }

            @Override
            public byte[] getEncoded() {
                return publicKey;
            }
        };
        return pKey;
    }
}
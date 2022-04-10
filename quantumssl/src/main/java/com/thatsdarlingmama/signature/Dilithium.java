package com.thatsdarlingmama.signature;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;

import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;

import org.openquantumsafe.Signature;

public class Dilithium extends java.security.Signature {
    private Signature dilithium;
    private byte[] privateKey;
    private byte[] publicKey;
    private byte[] messageToSign;

    public Dilithium() {
        super("Dilithium");
        dilithium = new Signature("Dilithium5");
        this.publicKey = dilithium.generate_keypair();
        this.privateKey = dilithium.export_secret_key();
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
        byte[] returnValue = dilithium.sign(messageToSign);
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
        return dilithium.verify(messageToSign, arg0, publicKey);
    }

    public byte[] getPrivateKey() {
        return privateKey;
    }
    public byte[] getPublicKey() {
        return publicKey;
    }

}
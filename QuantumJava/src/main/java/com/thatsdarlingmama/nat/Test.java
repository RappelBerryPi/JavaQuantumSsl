package com.thatsdarlingmama.nat;

import com.thatsdarlingmama.nat.LeanCryptoNative;

import javax.crypto.KEM;

public class Test {
    public static void main(String[] args) throws SignatureException, InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException {
        KeyPair keyPair = LeanCryptoNative.GetKeyPair(null);
    }
}

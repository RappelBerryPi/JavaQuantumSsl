package com.thatsdarlingmama;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.KeyAgreement;

import com.thatsdarlingmama.security.signature.Dilithium2SignatureSpi;
import com.thatsdarlingmama.security.signature.Dilithium5SignatureSpi;
import com.thatsdarlingmama.security.keyagreement.FireSaberKEMKeyAgreementSpi;
import com.thatsdarlingmama.security.keyagreement.Kyber1024KeyAgreementSpi;
import com.thatsdarlingmama.security.keyagreement.LightSaberKEMKeyAgreementSpi;
import com.thatsdarlingmama.security.signature.RainbowIClassicSignatureSpi;
import com.thatsdarlingmama.security.signature.picnicL1FSSignatureSpi;
import com.thatsdarlingmama.security.signature.picnicL1fullSignatureSpi;

import org.openquantumsafe.KEMs;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws SignatureException, InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException {
        //Provider p = Security.getProvider("Dilithium");
        //System.out.println(p.getInfo());


        /*
        var spi = new picnicL1FSSignatureSpi();

        Signature signature = Signature.getInstance("picnic_L1_FS");
        
        signature.initSign(spi.getPrivateKey());
        signature.update("Hello World!".getBytes());
        spi.update("Hello World!".getBytes());
        byte[] bytes = signature.sign();
        byte[] bytes2 = spi.sign();

        signature.initVerify(spi.getPublicKey());
        System.out.println(signature.verify(bytes));
        System.out.println(spi.verify(bytes2));
        */

        KeyAgreement keyAgreement = KeyAgreement.getInstance("Kyber1024");
        KeyAgreement keyAgreement2 = KeyAgreement.getInstance("Kyber1024");
        var spi = new Kyber1024KeyAgreementSpi();
        var spi2 = new Kyber1024KeyAgreementSpi();

        PrivateKey privateKey = spi.getPrivateKey();
        PrivateKey privateKey2 = spi2.getPrivateKey();
        PublicKey publicKey = spi.getPublicKey();
        PublicKey publicKey2 = spi2.getPublicKey();

        keyAgreement.init(privateKey);
        keyAgreement2.init(privateKey2);
        keyAgreement.doPhase(publicKey2, false);
        keyAgreement2.doPhase(publicKey, false);
        byte[] cipherText  = keyAgreement.generateSecret();
        byte[] cipherText2 = keyAgreement2.generateSecret();

        Key key = new Key() {
            @Override
            public String getAlgorithm() { return null; }

            @Override
            public byte[] getEncoded() {
                return cipherText;
            }

            @Override
            public String getFormat() { return null; }
        };
        Key key2 = new Key() {
            @Override
            public String getAlgorithm() { return null; }

            @Override
            public byte[] getEncoded() {
                return cipherText2;
            }

            @Override
            public String getFormat() { return null; }
        };



        Key key3 = keyAgreement.doPhase(key2, true);
        Key key4 = keyAgreement2.doPhase(key, true);

        byte[] broken = Base64.getDecoder().decode(key3.getFormat());
        byte[] broken2 = Base64.getDecoder().decode(key4.getFormat());

        System.out.println("Same Key: " + Arrays.equals(broken, key4.getEncoded()));
        System.out.println("Same Key: " + Arrays.equals(broken2, key3.getEncoded()));
    }
}

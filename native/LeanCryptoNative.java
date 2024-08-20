import java.security.KeyPair;

public class LeanCryptoNative {
    static {
        System.loadLibrary("javaleancrypto");
    }

    public static native KeyPair GetKeyPair(String keyPairType);

}

import java.security.KeyPair;

import javax.crypto.KEM;

public class Test {
    public static void main(String[] args) {
        KeyPair keyPair = LeanCryptoNative.GetKeyPair(null);
    }
}

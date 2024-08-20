#include "com_thatsdarlingmama_nat_LeanCryptoNative.h"
#include <stdio.h>
#include <leancrypto.h>


JNIEXPORT jobject JNICALL Java_com_thatsdarlingmama_nat_LeanCryptoNative_GetKeyPair(JNIEnv* env, jclass nativeClass, jstring string) {
    printf("Hello world\n");
    struct lc_kyber_sk sk;
    struct lc_kyber_pk pk;
    struct lc_kyber_ct ct;
    //sk.key.sk_1024.sk //byte 3128
    //sk.key.sk_512.sk //byte 1632
    //sk.key.sk_768.sk // sk 2400
    if (lc_kyber_keypair(&pk, &sk, lc_seeded_rng, LC_KYBER_1024)) {
        fprintf(stderr, "Error creating keypair\n");
    }

    jclass keyPair = FindClass(*env, "com.java.String");

    // TODO: start here: https://www.baeldung.com/jni, keep going. Build a key


}

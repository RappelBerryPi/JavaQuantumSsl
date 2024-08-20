#include "LeanCryptoNative.h"
#include <stdio.h>
#include <leancrypto.h>


JNIEXPORT jobject JNICALL Java_LeanCryptoNative_GetKeyPair(JNIEnv* env, jclass nativeClass, jstring string) {
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

    jclass keyPair = (*env)->FindClass(env, "java/security/KeyPair");
    //jclass keyPair = (*env)->FindClass(env, "java/lang/String");

    // TODO: start here: https://www.baeldung.com/jni, keep going. Build a key


}

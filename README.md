# JavaQuantumSsl

## Building
make -GNinja .. -DBUILD_SHARED_LIBS=ON

https://github.com/open-quantum-safe/liboqs-java

https://docs.oracle.com/javase/7/docs/api/java/security/SignatureSpi.html

https://docs.oracle.com/javase/9/security/howtoimplaprovider.htm#JSSEC-GUID-CC161921-EBD2-48C6-B543-A956658B68B6

https://developer.classpath.org/doc/javax/net/ssl/SSLContext-source.html

https://www.baeldung.com/maven-java-version

## Update 2024.

NIST on August 13th published FIPS 203, 204, and 205 with ML-KEM, ML-DSA, and SLH-DSA. As such, this project is moving off of
libOQS and is moving to the first published module with validate algorithms (although libOQS is still great and leancrypto hasn't
had it's 'module' validated as of yet).

This is also being extended to the KEM that is provided in Java 21.

default: clean

all: clean javac build

clean:
	rm -f *.class
	rm -f *.o
	rm -f *.so

javac:
	javac -h . LeanCryptoNative.java

build:
	gcc -c -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux LeanCryptoNative.c  -o LeanCryptoNative.o
	gcc -shared -fPIC -o libjavaleancrypto.so LeanCryptoNative.o -lc

install:
	sudo cp libjavaleancrypto.so /usr/lib/jni/
	sudo chown root:root /usr/lib/jni/libjavaleancrypto.so
	sudo chmod 755 /usr/lib/jni/libjavaleancrypto.so

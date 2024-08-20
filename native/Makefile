default: clean

all: clean javac build install test

clean:
	rm -f *.class
	rm -f *.o
	rm -f *.so
	@echo "clean done"
	@echo ""

javac:
	javac -h . LeanCryptoNative.java
	@echo "native java file generated"
	@echo ""

build:
	gcc -c -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux LeanCryptoNative.c  -o LeanCryptoNative.o
	gcc -shared -fPIC -o libjavaleancrypto.so LeanCryptoNative.o /usr/local/lib/x86_64-linux-gnu/libleancrypto.a -lc -z noexecstack
	@echo ".so build"
	@echo ""


install:
	sudo cp libjavaleancrypto.so /usr/lib/jni/
	sudo chown root:root /usr/lib/jni/libjavaleancrypto.so
	sudo chmod 755 /usr/lib/jni/libjavaleancrypto.so
	@echo ".so installed"
	@echo ""

test:
	javac Test.java
	java Test

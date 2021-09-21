package com.example.myndk;

public class JNITest {
    static {
        System.loadLibrary("Hello");
    }

    public native String sayHello();
}

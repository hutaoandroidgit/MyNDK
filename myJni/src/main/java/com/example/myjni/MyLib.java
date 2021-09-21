package com.example.myjni;

public class MyLib {
    static {
        System.loadLibrary("MyLib-jni");
    }

    public static native void Setcallback(IMtcCallback callback);
    public static native String GetDemoString();
}
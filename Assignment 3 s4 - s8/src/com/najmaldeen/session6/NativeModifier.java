package com.najmaldeen.session6;

class NativeModifier {
    native void nativeMethod(); // declaration of a native method
    /**
     * static code block to load the library
     */
    static {
        System.loadLibrary("NativeMethodDefinition");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NativeModifier objNative = new NativeModifier(); // line1
        objNative.nativeMethod(); // line2
    }
}

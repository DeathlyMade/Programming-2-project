package com.iiitb.imageEffectApplication.libraryInterfaces;

public class InvertInterface {
    static {
        String libraryPath = "C:\\Users\\T761\\OneDrive\\Desktop\\P2_project\\P2-2023-Project\\ImageEffectBackend\\src\\main\\resources\\InvertLib.dll";
        LoadNativeLibrary.loadNativeLibrary(libraryPath); // Load the native library

    }

    public static native Pixel[][] applyInvert(Pixel[][] image);
    // native method used JNI to call the C++ method
}

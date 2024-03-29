package com.iiitb.imageEffectApplication.libraryInterfaces;

public class ContrastInterface {
    static {
        String libraryPath = "C:\\Users\\T761\\OneDrive\\Desktop\\P2_project\\P2-2023-Project\\ImageEffectBackend\\src\\main\\resources\\ContrastLib.dll";
        LoadNativeLibrary.loadNativeLibrary(libraryPath); // Load the native library
    }

    public static native Pixel[][] applyContrast(Pixel[][] image, float amount);
    // native method used JNI to call the C++ method
}

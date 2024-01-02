package com.iiitb.imageEffectApplication.libraryInterfaces;




public class RotationInterface {
    static {
        String libraryPath = "C:\\Users\\T761\\OneDrive\\Desktop\\P2_project\\P2-2023-Project\\ImageEffectBackend\\src\\main\\resources\\RotationLib.dll";
        LoadNativeLibrary.loadNativeLibrary(libraryPath);
    }

    public static native Pixel[][] applyRotation(Pixel[][] image, int value);
}

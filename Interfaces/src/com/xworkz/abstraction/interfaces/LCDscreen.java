package com.xworkz.abstraction.interfaces;

public interface LCDscreen {

    int calculateResolution();
    double measureBrightness();
    boolean supportsHDR();
    char screenCategory();
    long generateSerialNumber();

    Product createProduct();
    Device connectDevice();
    Color detectColor();
    Item manufactureItem();
    Material buildMaterial();

    int[] generatePixelData();
    double[] measureBrightnessLevels();

    Product[] listProducts();
    Device[] findConnectedDevices();

    void displayScreen();
    }


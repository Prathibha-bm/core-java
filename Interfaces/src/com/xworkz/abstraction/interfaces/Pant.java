package com.xworkz.abstraction.interfaces;

public interface Pant {

    int measureWaistSize();
    double calculatePrice();
    boolean isAvailable();
    char identifyCategory();
    long generateProductId();
    Product createProduct();
    Drawable createDesign();
    Color detectColor();
    Item manufactureItem();
    Material selectMaterial();

    int[] availableSizes();
    double[] priceList();
    Product[] relatedProducts();
    Material[] usedMaterials();

    void wear();
}

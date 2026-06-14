package com.xworkz.abstraction.interfaces;

public interface Cardboard {

        int getThickness();
        double getArea();
        boolean isRecyclable();
        char getQuality();
        long getBatchNumber();

        Product getProduct();
        Device getDevice();
        Size getSize();
        Item getItem();
        Material getMaterial();

        int[] getDimensions();
        double[] getWeights();

        Product[] getProducts();
        Material[] getMaterials();
        void fold();

}

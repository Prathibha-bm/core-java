package com.xworkz.abstraction.interfaces;

public interface Pencil{

        int measureLength();
        double calculateCost();
        boolean isSharp();
        char determineGrade();
        long generateBarcode();

        Product createProduct();
        Device connectDevice();
        Color identifyColor();
        Item manufactureItem();
        Material chooseMaterial();

        int[] generateMarks();
        double[] takeMeasurements();

        Product[] listProducts();
        Material[] availableMaterials();
        void write();

}

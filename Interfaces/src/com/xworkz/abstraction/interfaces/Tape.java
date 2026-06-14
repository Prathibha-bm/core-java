package com.xworkz.abstraction.interfaces;

public interface Tape {
        int measureLength();
        double measureWidth();
        boolean isSticky();
        char identifyType();
        long generateTapeId();

        Product createProduct();
        Device connectDevice();
        Color detectColor();
        Item manufactureItem();
        Material selectMaterial();

        int[] generateMarks();
        double[] calculateMeasurements();

        Product[] listProducts();
        Material[] availableMaterials();

        void stick();

}

package com.xworkz.abstraction.interfaces;

public interface Candle {

        int calculateLength();
        double measureWeight();
        boolean checkLit();
        char identifyType();
        long generateCode();

        Product createProduct();
        Drawable draw();
        Color detectColor();
        Item manufactureItem();
        Material produceMaterial();

        int[] generateBurnTimes();
        double[] measureTemperatures();

        Product[] createProducts();
        Material[] produceMaterials();

        void burn();
}


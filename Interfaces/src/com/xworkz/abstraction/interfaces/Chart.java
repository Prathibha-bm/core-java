package com.xworkz.abstraction.interfaces;

public interface Chart {
        int countRows();
        double calculateScale();
        boolean isColored();
        char identifyVersion();
        long generateChartId();

        Product createProduct();
        Drawable createDrawing();
        Color detectColor();
        Item manufactureItem();
        Material selectMaterial();

        int[] generateValues();
        double[] calculatePercentages();

        Product[] listProducts();
        Material[] availableMaterials();
        void draw();
}

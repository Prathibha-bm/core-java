package com.xworkz.abstraction.interfaces;

public interface Vegetable {
        int calculateQuantity();
        double calculatePrice();
        boolean isFresh();
        char identifyGrade();
        long generateLotNumber();

        Product createProduct();
        Drawable createDrawing();
        Color detectColor();
        Item manufactureItem();
        Material selectMaterial();

        int[] generateStockLevels();
        double[] calculateWeights();

        Product[] listProducts();
        Material[] availableMaterials();

        void grow();

}

package com.xworkz.abstraction.interfaces;

public interface Knife {
        int measureBladeLength();
        double calculateWeight();
        boolean isSharp();
        char identifyCategory();
        long generateKnifeId();

        Product createProduct();
        Device connectDevice();
        Color detectColor();
        Item manufactureItem();
        Tool selectTool();

        int[] generateCutSizes();
        double[] calculateAngles();

        Product[] listProducts();
        Tool[] availableTools();
        void cut();

}

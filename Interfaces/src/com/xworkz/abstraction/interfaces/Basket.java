package com.xworkz.abstraction.interfaces;

public interface Basket {
        int calculateCapacity();
        double measureWeight();
        boolean isEmpty();
        char identifyType();
        long generateBasketId();

        Product createProduct();
        Device connectDevice();
        Size determineSize();
        Container buildContainer();
        Material selectMaterial();

        int[] generateItemCounts();
        double[] calculateLoads();

        Product[] listProducts();
        Material[] availableMaterials();
        void carry();

}

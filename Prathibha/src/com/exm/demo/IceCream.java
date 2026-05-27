package com.exm.demo;

public class IceCream {
    private String flavor;
    private String brand;
    private int price;
    private boolean isVeg;
    private double quantityInMl;


    public IceCream() {
    }

    public IceCream(String flavor, String brand, int price, boolean isVeg, double quantityInMl) {
        this.flavor = flavor;
        this.brand = brand;
        this.price = price;
        this.isVeg = isVeg;
        this.quantityInMl = quantityInMl;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public double getQuantityInMl() {
        return quantityInMl;
    }

    public void setQuantityInMl(double quantityInMl) {
        this.quantityInMl = quantityInMl;

    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null) {
            IceCream ice1 = this;

            if (obj instanceof IceCream) {
                IceCream ice2 = (IceCream) obj;

                if (ice1.flavor.equals(ice2.flavor) && ice1.price == (ice2.price)) {
                    return true;
                }
            }
        }
        return false;
    }
}


package com.exm.demo;

public class Battery {
    private String brand;
    private int cost;
    private String capacity;
    private String durability;
    private String watt;

    public Battery() {

    }

    public Battery(String brand, int cost, String capacity, String durability, String watt) {
        this.brand = brand;
        this.cost = cost;
        this.capacity = capacity;
        this.durability = durability;
        this.watt = watt;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String durability) {
        this.durability = durability;
    }

    public String getWatt() {
        return watt;
    }

    public void setWatt(String watt) {
        this.watt = watt;
    }


    @Override
    public boolean equals(Object obj) {

        if (obj != null) {
            Battery battery1 = this;

            if (obj instanceof Battery) {
                Battery battery2 = (Battery) obj;

                if (battery1.brand.equals(battery2.brand) && battery1.durability==(battery2.durability)){
                    return true;
                }
            }
        }
        return false;
    }
}

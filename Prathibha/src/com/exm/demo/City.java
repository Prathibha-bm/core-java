package com.exm.demo;

public class City {
    private String name;
    private int cityCode;
    private String famousFor;
    private String state;

    public City() {
    }

    public City(String name, int cityCode, String famousFor, String state) {
        this.name = name;
        this.cityCode = cityCode;
        this.famousFor = famousFor;
        this.state = state;
    }

    public String getCityName() {
        return name;
    }

    public void setCityName(String name) {
        this.name = name;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getFamousFor() {
        return famousFor;
    }

    public void setFamousFor(String famousFor) {
        this.famousFor = famousFor;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null) {
            City city1 = this;

            if (obj instanceof City) {
                City city2 = (City) obj;

                if (city1.name.equals(city2.name) && city1.cityCode == (city2.cityCode)) {

                    return true;
                }
            }
        }
        return false;
    }
}

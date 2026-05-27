package com.exm.demo;

public class Sensor {
    private String sensorName;
    private String sensorType;
    private double currentReading;
    private boolean isActive;
    private int price;


    public Sensor() {
    }

    public Sensor(String sensorName, String sensorType, double currentReading, boolean isActive, int price) {
        this.sensorName = sensorName;
        this.sensorType = sensorType;
        this.currentReading = currentReading;
        this.isActive = isActive;
        this.price = price;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public double getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(double currentReading) {
        this.currentReading = currentReading;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null) {
            Sensor sensor1 = this;

            if (obj instanceof Sensor) {
                Sensor sensor2 = (Sensor) obj;

                if (sensor1.sensorName.equals(sensor2.sensorName) && sensor1.price == (sensor2.price)) {
                    return true;
                }
            }
        }
        return false;
    }
}

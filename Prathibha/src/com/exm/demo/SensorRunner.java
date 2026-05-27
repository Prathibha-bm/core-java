package com.exm.demo;

public class SensorRunner {
    public static void main(String[] args) {
        Sensor sensor1 =new Sensor("HC-SR04", "Proximity/Distance", 12.8, false, 120);
        Sensor sensor2 =new Sensor("HC-SR04", "Proximity/Distance", 12.8, false, 120);
        Sensor sensor3 =new Sensor("HC-SR04", "Proximity/Distance", 12.8, false, 1200);

        boolean correct= sensor1.equals(sensor2);
        System.out.println(correct);

        boolean notSame= sensor1.equals(sensor3);
        System.out.println(notSame);
    }
}

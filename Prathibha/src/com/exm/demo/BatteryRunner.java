package com.exm.demo;

public class BatteryRunner {
    public static void main(String[] args) {
        Battery battery1 =new Battery("Prestige", 3500, "750ml", "2 years", "750W");
        Battery battery2 =new Battery("Prestige", 3500, "750ml", "2 years", "750W");
        Battery battery3 =new Battery("Samsung", 25000, "250 Liters", "10 years", "120W");

        boolean correct= battery1.equals(battery2);
        System.out.println(correct);

        boolean notSame= battery1.equals(battery3);
        System.out.println(notSame);
    }
}

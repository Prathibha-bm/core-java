package com.exm.demo;

public class IcecreamRunner {
    public static void main(String[] args) {
        IceCream ice1 =new IceCream("Vanilla", "Amul", 20, true, 100.7);
        IceCream ice2 =new IceCream("Vanilla", "Amul", 20, true, 100.0);
        IceCream ice3 =new IceCream("Vanilla", "Amul", 60, true, 200.7);

        boolean correct= ice1.equals(ice2);
        System.out.println(correct);

        boolean notSame= ice1.equals(ice3);
        System.out.println(notSame);
    }
}


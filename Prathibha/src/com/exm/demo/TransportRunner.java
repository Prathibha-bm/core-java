package com.exm.demo;

public class TransportRunner {
    public static void main(String[] args) {
        TransportMode ice1 =new TransportMode("Metro Train", "BMRCL", 40, 80.0, true);
        TransportMode ice2 =new TransportMode("Metro Train", "BMRCL", 40, 80.0, true);
        TransportMode ice3 =new TransportMode("Metro Train", "BMRCL", 80, 80.0, true);

        boolean correct= ice1.equals(ice2);
        System.out.println(correct);

        boolean notSame= ice1.equals(ice3);
        System.out.println(notSame);
    }
}

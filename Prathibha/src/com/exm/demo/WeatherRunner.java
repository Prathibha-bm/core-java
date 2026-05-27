package com.exm.demo;

public class WeatherRunner {
    public static void main(String[] args) {

        Weather weather1 = new Weather("Karnataka", true, false, true, false);
        Weather weather2 = new Weather("Karnataka", true, false, true, false);
        Weather weather3 = new Weather("Kerala", true, true, false, true);

        boolean correct = weather1.equals(weather2);
        System.out.println(correct);

        boolean notSame = weather1.equals(weather3);
        System.out.println(notSame);
    }
}
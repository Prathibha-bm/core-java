package com.exm.demo;

public class CityRunner {
    public static void main(String[] args) {
        City city1= new City("Chikkamagaluru",18,"Cofee","Karnataka");
        City city2 =new City("Chikkamagaluru",18,"Cofee","Karnataka");
        City city3 =new City("Daravada",22,"Peda","Karnataka");

        boolean correct=city1.equals(city2);
        System.out.println(correct);

        boolean notSame=city1.equals(city3);
        System.out.println(notSame);
    }
}

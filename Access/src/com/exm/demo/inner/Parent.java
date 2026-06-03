package com.exm.demo.inner;

public class Parent {

protected static String personName;

    protected Parent(String personName){
        this.personName=personName;
        System.out.println("protected constructor in Parent class");
    }

    protected void display(){
        System.out.println("protected method in parent class");
        System.out.println("Person name is "+personName);

    }

}

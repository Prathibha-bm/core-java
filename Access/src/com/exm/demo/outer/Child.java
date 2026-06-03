package com.exm.demo.outer;

import com.exm.demo.inner.Parent;

public class Child extends Parent {

    protected Child(){
        super("Prathibha");
        System.out.println("protected constructor in child class");
    }
     protected void show(){
        System.out.println("show method in child class");
         display();
     }


}



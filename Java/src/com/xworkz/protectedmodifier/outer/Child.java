//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.xworkz.protectedmodifier.outer;

import com.xworkz.protectedmodifier.inner.Parent;

public class Child extends Parent {
    protected Child() {
        super("Prathibha");
        System.out.println("protected constructor in child class");
    }

    protected void show() {
        System.out.println("show method in child class");
        this.display();
    }
}

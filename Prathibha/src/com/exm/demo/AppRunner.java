package com.exm.demo;

public class AppRunner {
        public static void main(String[] args) {
            Application app1 =new Application("WhatsApp", "Social Media", 2, true, 0);
            Application app2 =new Application("WhatsApp", "Social Media", 2, true, 0);
            Application app3 =new Application("Adobe Photoshop", "Photo Editing", 4, false, 1500);

            boolean correct= app1.equals(app2);
            System.out.println(correct);

            boolean notSame= app1.equals(app3);
            System.out.println(notSame);
        }
    }


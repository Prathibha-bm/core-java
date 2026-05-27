package com.exm.demo;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera1=new Camera(50,"DSLR",3434,9,"sml");
        Camera camera2=new Camera(70,"DSLR",3434,9 ,"sml");
        Camera camera3=new Camera(80,"Canon",9887,7,"Jk");

        boolean isSame=camera1.equals(camera2);
        System.out.println(isSame);
        boolean isCorrect=camera1.equals(camera3);
        System.out.println(isCorrect);
    }
}

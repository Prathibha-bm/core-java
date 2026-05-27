package com.exm.demo;

public class ReportRunner {
    public static void main(String[] args) {

        Report report1= new Report("Data Science",55,"Final",true,"white");
        Report report2 =new Report("Data Science",55,"Final",true,"white");
        Report report3 =new Report("ML",25,"Intermediate",false,"Brown");

        boolean correct=report1.equals(report2);
        System.out.println(correct);

        boolean notSame=report1.equals(report3);
        System.out.println(notSame);
    }
}

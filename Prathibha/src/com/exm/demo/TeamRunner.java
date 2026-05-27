package com.exm.demo;

public class TeamRunner {
    public static void main(String[] args) {

        IPLteam team1=new IPLteam("RCB",25,"Rajat Patidar","Benagaluru",2);
        IPLteam team2=new IPLteam("RCB",25,"Rajat Patidar","Benagaluru",2);
        IPLteam team3=new IPLteam("GT",25,"Shubman Gill","Gujrat",1);

        boolean correct=team1.equals(team2);
        System.out.println(correct);

        boolean notSame=team1.equals(team3);
        System.out.println(notSame);





    }
}

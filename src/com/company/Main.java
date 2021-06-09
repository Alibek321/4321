package com.company;



public class Main {

    public static void main(String[] args) {

        Boss dragan= new Boss(800,100,1000);
        System.out.println("BOSS:"+" "+dragan.attakt+"AT "+dragan.HP+"HP");


        System.out.println("_____________[VS]______________");


        heroes medic = new heroes(666,50,350);
        System.out.println(" MADIC:" + " "+ medic.attakt +"AT "+medic.HP +"HP "+medic.supers+"SS");
        medic.makeVoice();











    }
}




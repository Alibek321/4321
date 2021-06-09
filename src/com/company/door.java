package com.company;

public class door {
    public heroes[] heroess = new heroes[4];

    public heroes[] getPlayers(){
        heroess[0] = new heroes(200,200,20);
        heroess[1] = new heroes(200,200,20);
        heroess[2] = new heroes(200,200,20);
        heroess[3] = new heroes(200,200,20);
        return heroess;


    }
}

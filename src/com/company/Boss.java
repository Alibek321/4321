package com.company;

public class Boss {

    int attakt;
    int HP;
    int defenceType;

    public int getAttakt() {
        return attakt;
    }

    public void setAttakt(int attakt) {
        this.attakt = attakt;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }

    public void changeDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }

    public Boss (int attakt, int HP,int defenceType) {

        this.attakt = attakt;
        this.HP = HP;
        this.defenceType= defenceType;




    }
}

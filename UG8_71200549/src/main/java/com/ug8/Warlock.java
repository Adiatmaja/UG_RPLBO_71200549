package com.ug8;

public class Warlock extends Hero implements Summoner{
    private int numOfSummon;

    public Warlock(){
        super("Warlock", 700, 80);
    }

    public Golem summon(){
        this.numOfSummon += 1;
        return null;
    }

    @Override
    public void attack(Creep creep) {
        creep.health -= this.damage;
    }
}

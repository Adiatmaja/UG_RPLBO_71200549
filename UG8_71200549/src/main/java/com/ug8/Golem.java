package com.ug8;

public class Golem extends SummonCharacter implements Summoner{
    private int kill;

    public Golem(Golem summoner){
        super("Golem", 1000, 120, summoner);
    }

    public Character summon(){
        if (kill > 0){
            this.kill -= 1;
            return new Golem(this);
        } else {
            return null;
        }
    }

    @Override
    public void attack(Creep creep) {
        creep.health -= this.damage;
        if (creep.health <= 0){
            kill += 1;
        }
    }
}

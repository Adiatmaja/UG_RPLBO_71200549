package com.ug8;

public class Creep extends Character implements AttackingHero{
    public Creep(String name, int health, int damage){
        super("Creep", 200, 20);
    }

    public void attack(Hero hero){
        hero.health -= this.damage;
    }
}

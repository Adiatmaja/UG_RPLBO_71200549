package com.ug8;

public abstract class Hero extends Character implements AttackingCreep{
    public Hero (String name, int health, int damage){
        super(name, health, damage);
    }
}

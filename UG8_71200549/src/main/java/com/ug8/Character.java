package com.ug8;

public abstract class Character {
    protected int damage;
    protected String name;
    protected int health;

    public Character (String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attacked(int damage){
        this.health -= damage;
    }

    public void showCharacterInfo(){
        System.out.println("Nama = " + this.name);
        System.out.println("Health = " + this.health);
        System.out.println("Damage = " + this.damage);
    }

    public boolean isDie(){
        if (health <= 0){
            return true;
        } else {
            return false;
        }
    }
}

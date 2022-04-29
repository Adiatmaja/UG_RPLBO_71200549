package com.ug9.mobilelegend;

public class Melee extends Hero implements Skill{
    public Melee(String name, int damage, int health){
        super(name, damage, health);
    }

    @Override
    public void attack(Character enemy) {
        if (enemy instanceof Creep){
            setHealthBonus(200);
        }
        super.attack(enemy);
    }

    @Override
    public void ultimate(){
        addDamage(100);
        System.out.println(getName() + " mengaktifkan ulti. Damage saat ini bertambah 100");
    }
}

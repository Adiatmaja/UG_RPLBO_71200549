package com.ug9.mobilelegend;

public class Minion extends NPC{
    public Minion (String name, int damage, int health){
        super(name, damage, health);
    }

    @Override
    public void attack(Character enemy) {
        if (enemy instanceof Creep){
            System.out.println("Tidak Bisa Menyerang Creep");
        } else {
            if (enemy instanceof Melee || enemy instanceof Ranged){
                this.setDamage(getDamage() + 100);
            }
            enemy.setHealth(getHealth() - getDamage());
            if (enemy.getHealth() <= 0){
                enemy.setDie(true);
            }
            attackInformation(enemy, getDamage());
        }
    }
}

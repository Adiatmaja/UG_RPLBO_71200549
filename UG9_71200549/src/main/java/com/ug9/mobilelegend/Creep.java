package com.ug9.mobilelegend;

public class Creep extends NPC{
    public Creep(String name, int damage, int health){
        super(name, damage, health);
    }
    @Override
    public void attack(Character enemy) {
        if (enemy instanceof Creep || enemy instanceof Minion){
            System.out.println("Tidak Bisa Menyerang Creep atau Minion");
        } else {
            if (enemy instanceof Melee || enemy instanceof Ranged){
                this.setDamage(getDamage() + 100);
            }
            enemy.setHealth(enemy.getHealth() - getDamage());
            if (enemy.getHealth() <= 0){
                enemy.setDie(true);
            }
            attackInformation(enemy, getDamage());
        }
    }
}

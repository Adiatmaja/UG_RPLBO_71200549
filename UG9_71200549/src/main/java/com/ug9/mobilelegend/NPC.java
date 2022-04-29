package com.ug9.mobilelegend;

public class NPC extends Character{
    public NPC (String name, int damage, int health){
        super(name, damage, health);
    }

    @Override
    public void attack(Character enemy) {
        if (enemy instanceof Melee || enemy instanceof Ranged){
            this.setDamage(+100);
        }
        enemy.setHealth(enemy.getHealth() - getDamage());
        if (enemy.getHealth() <= 0){
            enemy.setHealth(0);
            enemy.setDie(true);
        }
        attackInformation(enemy, getDamage());
    }
}

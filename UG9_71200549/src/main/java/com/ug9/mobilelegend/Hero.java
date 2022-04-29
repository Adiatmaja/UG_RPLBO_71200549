package com.ug9.mobilelegend;

public class Hero extends Character{
    private int healthBonus;
    private int level = 1;
    private int healthMax;
    private int lifeSteal = 50;

    public Hero(String name, int damage, int health){
        super(name, damage, health);
        this.healthMax = health;
    }

    @Override
    public void attack(Character enemy) {
        enemy.setHealth(enemy.getHealth() - getDamage());
        setHealth(getHealth() + lifeSteal);

        if (getHealth() > healthMax){
            setHealth(healthMax);
        }
        if (enemy.getHealth() <= 0){
            enemy.setHealth(0);
            enemy.setDie(true);
            this.level += 1;
            if (enemy instanceof Melee || enemy instanceof Ranged){
                lifeSteal += 150;
            } else if (enemy instanceof Minion || enemy instanceof Creep){
                this.healthMax += this.healthBonus;
            }
        }
        attackInformation(enemy, getDamage());
    }

    public void addDamage(int damage){
        setDamage(damage + getDamage());
    }

    public void setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;
    }

    public int getLevel() {
        return level;
    }
}

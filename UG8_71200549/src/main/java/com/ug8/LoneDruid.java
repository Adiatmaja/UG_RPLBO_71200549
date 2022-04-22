package com.ug8;

public class LoneDruid extends Hero implements Summoner, Upgradeable{
    private int killCreep;
    private int level;

    public LoneDruid(){
        super("Lone Druid", 1000, 140);
    }

    @Override
    public Character summon() {
        return new SpiritBear(this);
    }

    @Override
    public void upgrade(){
        if (killCreep >= 3){
            this.level += 1;
            this.killCreep -= 3;
            this.name = "Lone Druid " + this.level;
            this.damage += 20;
        }
    }

    @Override
    public void showCharacterInfo() {
        super.showCharacterInfo();
        System.out.println("Kill Creep = " + this.killCreep);
    }

    @Override
    public void attack(Creep creep) {
        creep.health -= this.damage;
        if (creep.isDie() == true){
            this.killCreep += 1;
        }
    }
}

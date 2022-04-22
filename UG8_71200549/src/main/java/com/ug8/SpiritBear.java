package com.ug8;

public class SpiritBear extends SummonCharacter{
    public SpiritBear(LoneDruid lonedruid){
        super("Spirit Bear", 1000, 130, lonedruid);
    }

    @Override
    public void attack(Creep creep) {
        creep.health -= this.damage;
    }


}

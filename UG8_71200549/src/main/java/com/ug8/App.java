package com.ug8;

public class App {
    public static void main( String[] args ) {
        System.out.println("1. Pembuatan Creep 1, 2 dan 3");
        Creep creep1 = new Creep("Creep1",20,200);
        Creep creep2 = new Creep("Creep2",20,200);
        Creep creep3 = new Creep("Creep3",20,200);

        System.out.println("2. Pembuatan Objek Lone Druid, Warlock, summon Spiritbear dan Golem");
        LoneDruid loneDruid = new LoneDruid();
        Warlock warlock = new Warlock();
        SpiritBear spiritBear = (SpiritBear) loneDruid.summon();
        Golem golem = warlock.summon();

        System.out.println("3. Info sebelum Spirit Bear dan Warlock diserang");
        spiritBear.showCharacterInfo();
        System.out.println("\n");
        warlock.showCharacterInfo();
        System.out.println("\n");

        creep1.attack(spiritBear);
        creep1.attack(warlock);

        System.out.println("3. Info setelah Spirit Bear dan Warlock diserang");
        spiritBear.showCharacterInfo();
        warlock.showCharacterInfo();

        System.out.println("4, 5, 6. Info sebelum semua creep diserang");
        creep1.showCharacterInfo();
        System.out.println("\n");
        creep2.showCharacterInfo();
        System.out.println("\n");
        creep3.showCharacterInfo();
        System.out.println("\n");

        System.out.println("4. Lone Druid menyerang creep 1\n5. Spirit Bear menyerang creep 2\n6. Warlock menyerang creep 3\n");
        loneDruid.attack(creep1);
        spiritBear.attack(creep2);
        warlock.attack(creep3);

        System.out.println("Setelah creep diserang");
        creep1.showCharacterInfo();
        System.out.println("\n");
        creep2.showCharacterInfo();
        System.out.println("\n");
        creep3.showCharacterInfo();
        System.out.println("\n");

        System.out.println("7. Golem menyerang creep 1 dan 2");
        golem.attack(creep1);
        golem.attack(creep2);

        System.out.println("Setelah creep diserang");
        creep1.showCharacterInfo();
        System.out.println("\n");
        creep2.showCharacterInfo();
        System.out.println("\n");

        Golem minigolem = (Golem) golem.summon();

        loneDruid.showCharacterInfo();
        System.out.println("\n");
        spiritBear.showCharacterInfo();
        System.out.println("\n");
        minigolem.showCharacterInfo();
    }
}

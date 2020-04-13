package com.alex.arena;

public class Arena {
    public static void main(String[] args) throws InterruptedException {
        Warrior warrior1 = new Gladiator("No name Gladiator");
        Warrior warrior2 = new Wizard();

        System.out.println(warrior1);
        System.out.println(warrior2);

        while (warrior1.isAlive() && warrior2.isAlive()){
            Thread.sleep(1000);
            warrior1.attack(warrior2);
            System.out.println(warrior1.toShortString());
            warrior2.attack(warrior1);
            System.out.println(warrior2.toShortString());
        }
        if(warrior1.isAlive()){
            System.out.println(warrior1.getName() + " is a winner");
        }else {
            System.out.println(warrior2.getName() + " is a winner");
        }
    }
}

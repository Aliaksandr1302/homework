package com.alex.arena;

public class Wizard extends Warrior {
    private int magicAttack = 50;
    private int manna = 4;

    public Wizard() {
        super("No name wizard", 15, 70);
        this.magicAttack = magicAttack;
        this.manna = manna;
    }

    @Override
    public void attack(Warrior warrior) {
        if (manna >= 4) {
            warrior.takeDamage(magicAttack);
            manna = 0;
        } else {
            warrior.takeDamage(attack);
            manna++;
        }
    }

    @Override
    public String toString() {
        return "Wizard{" +
                ", name='" + name + '\'' +
                "magicAttack=" + magicAttack +
                ", manna=" + manna +
                ", attack=" + attack +
                ", health=" + health +
                '}';
    }
}

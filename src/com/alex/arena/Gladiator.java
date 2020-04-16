package com.alex.arena;


public class Gladiator extends Warrior {
    private int defense = 35;

    public Gladiator(String name) {
        super(name, 30, 100);
    }

    @Override
    public void takeDamage(int damage) {
        if (defense > 0) {
            if (defense >= damage) {
                defense -= damage;
            } else {
                damage = damage - defense;
                health -= damage;
                defense = 0;
            }
        } else {
            health -= damage;
        }
    }

    @Override
    public void attack(Warrior warrior) {
        warrior.takeDamage(attack);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", health=" + health +
                ", defense=" + defense +
                '}';
    }
}

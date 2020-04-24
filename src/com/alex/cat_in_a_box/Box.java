package com.alex.cat_in_a_box;

import java.util.Random;

public class Box {
    private boolean status = true;
    private Random random = new Random();
    private Cat cat;

    public Box(Cat cat) {
        this.cat = cat;
    }

    public void openedBox() {
        if (status) {
            status = false;
            isCatIsAlive();
            catAliveProbability();
        } else {
            System.out.println("Box opened");
            if (!cat.getIsAlive()) {
                System.out.println("Cat is dead");
            } else {
                System.out.println("Cat is alive");
            }
        }

    }

    private void isCatIsAlive() {
        int probability = random.nextInt(100);
        if (probability < 50) {
            cat.setIsAlive(false);
        }
    }

    private void catAliveProbability() {
        if (status) {
            if (!cat.getIsAlive()) {
                System.out.println("Cat is dead");
            } else {
                System.out.println("Cat is alive");
            }
        }
    }

}

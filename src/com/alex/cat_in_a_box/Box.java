package com.alex.cat_in_a_box;

import java.util.Random;

public class Box {
    private boolean status;
    private Random random = new Random();
    private boolean catIsAlive;


    public Box(Cat cat) {
        this.status = false;
        this.catIsAlive = cat.getIsAlive();
    }


   public void openedBox() {
       status = true;
       isCatIsAlive();
       catAliveProbability();
    }

    private boolean isCatIsAlive(){
        int probability = random.nextInt(100);
        if (probability < 50){
            catIsAlive = true;
        }
        return catIsAlive;
    }

    private int catAliveProbability() {
        if (!status) {
            return 50;
        } else if (!catIsAlive) {
            System.out.println("Cat is dead");
            return 0;
        } else {
            System.out.println("Cat is alive");
            return 100;
        }
    }

}

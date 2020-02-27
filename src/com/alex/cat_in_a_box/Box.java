package com.alex.cat_in_a_box;

import javafx.animation.ScaleTransition;

import java.nio.channels.ScatteringByteChannel;
import java.util.Random;
import java.util.Scanner;

public class Box {
    private boolean status;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static Cat cat = new Cat();
    private static Box box = new Box(cat);

    private Box(Cat cat) {
        this.status = true;
    }

    public static void main(String[] args) {
        System.out.println("Enter Cat name");
        cat.setName(scanner.nextLine());
        System.out.println(box.statusBox(box));
        System.out.println("the probability that the cat is alive " + box.catAliveProbability(box) + "%");
        box.openedBox();
        System.out.println(box.statusBox(box));
        System.out.println("the probability that the cat is alive " + box.catAliveProbability(box) + "%");
    }

    private void openedBox() {
        box.status = false;
        int probability = random.nextInt(100);
        if (probability < 50) {
            cat.setIsAlive(false);
            System.out.println(cat.getName() + " is dead");
        } else {
            System.out.println(cat.getName() + " alive");
        }
    }

    private int catAliveProbability(Box box) {
        if (status) {
            return 50;
        } else if (!cat.getIsAlive()) {
            return 100;
        } else {
            return 0;
        }
    }

    private String statusBox(Box box) {
        if (status) {
            return "Box closed";
        } else {
            return "Box opened";
        }
    }


}

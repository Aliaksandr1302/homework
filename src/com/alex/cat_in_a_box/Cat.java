package com.alex.cat_in_a_box;

public class Cat {
    private String name;
    private boolean alive = true;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public Cat(String name, boolean alive) {
        this.name = name;
        this.alive = alive;
    }

}

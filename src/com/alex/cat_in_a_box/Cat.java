package com.alex.cat_in_a_box;

public class Cat {
    private String name;
    private boolean alive;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setIsAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean getIsAlive() {
        return alive;
    }

    public Cat(String name) {
        this.name = name;
        this.alive = true;
    }

    public Cat(){
    }

}


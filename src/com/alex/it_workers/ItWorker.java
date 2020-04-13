package com.alex.it_workers;

import java.util.Objects;

public abstract class ItWorker implements MakerСoffee{
    private String name;
    private TypeDeveloper typeDeveloper;
    private boolean needCoffee;
    private boolean availabilityCoffee;

    protected ItWorker (String name, TypeDeveloper typeDeveloper){
        this.name= name;
        this.typeDeveloper= typeDeveloper;
        this.needCoffee = true;
        this.availabilityCoffee = false;
    }

    public void setAvailabilityCoffee(boolean availabilityCoffee) {
        this.availabilityCoffee = availabilityCoffee;
    }

    public boolean isAvailabilityCoffee() {
        return availabilityCoffee;
    }

    protected ItWorker(String name){
        this.name = name;
        this.needCoffee = true;
        this.availabilityCoffee = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeDeveloper getTypeDeveloper() {
        return typeDeveloper;
    }


    public boolean isNeedCoffee() {
        return needCoffee;
    }

    public void setNeedCoffee(boolean needCoffee) {
        this.needCoffee = needCoffee;
    }

    @Override
    public String toString() {
        return "ItWorker{" +
                "name='" + name + '\'' +
                ", typeDeveloper=" + typeDeveloper +
                ", needCoffee=" + needCoffee +
                ", availabilityCoffee=" + availabilityCoffee +
                '}';
    }
//    @Override
//    public String toString() {
//        return "ItWorker{" +
//                "name='" + name + '\'' +
//                ", needCoffee=" + needCoffee +
//                ", availabilityCoffee=" + availabilityCoffee +
//                '}';
//    }

    @Override
    public void makeCoffee() {
    }

}

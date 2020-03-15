package com.alex.it_workers;

public class Intern extends ItWorker implements MakerСoffee {

    protected Intern(String name) {
        super(name);
    }

    @Override
    public void makeCoffee() {
        if(isNeedCoffee()){
            setAvailabilityCoffee(true);
            setNeedCoffee(false);
        }
    }
    public void givCoffee(){
        makeCoffee();
    }
}

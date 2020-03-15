package com.alex.it_workers;

public class TeamLead extends ProjectWorker implements Manager,Developer {
    @Override
    public void manage() {
        
    }

    @Override
    public void develop() {

    }

    public TeamLead(String name) {
        super(name);
    }
}

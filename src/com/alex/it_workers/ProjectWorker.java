package com.alex.it_workers;

public abstract class ProjectWorker extends ItWorker {

    public ProjectWorker(String name, TypeDeveloper typeDeveloper) {
        super(name, typeDeveloper);
    }

    public ProjectWorker(String name) {
        super(name);
    }
}

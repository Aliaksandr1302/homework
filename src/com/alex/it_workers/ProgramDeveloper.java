package com.alex.it_workers;

public class ProgramDeveloper extends ProjectWorker implements Developer {
    @Override
    public void develop() {

    }

    public ProgramDeveloper(String name, TypeDeveloper typeDeveloper) {
        super(name, typeDeveloper);
    }
}

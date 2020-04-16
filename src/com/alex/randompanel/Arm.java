package com.alex.randompanel;

public class Arm extends Controller implements Pullable {

    @Override
    public void pull() {
        System.out.println("PULLED");
    }
}
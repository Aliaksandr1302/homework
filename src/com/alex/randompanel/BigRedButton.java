package com.alex.randompanel;

public class BigRedButton extends Controller implements Clickable {
    @Override
    public void click() {
        System.out.println("NOOOOOO, WHY DID U DO THAT????");
        System.exit(-1);
    }
}
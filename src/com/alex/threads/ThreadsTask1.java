package com.alex.threads;

public class ThreadsTask1 {
    public static void main(String[] args){
        Thread thread = new Thread();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
    }
}

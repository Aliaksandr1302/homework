package com.alex.threads;

public class ThreadsTask2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        thread1.start();
        thread2.start();
     for(int i = 0; i < 20; i++){
            System.out.println(thread1.getName());
            thread1.join();
            System.out.println(thread2.getName());
            thread2.join();
        }
    }
}

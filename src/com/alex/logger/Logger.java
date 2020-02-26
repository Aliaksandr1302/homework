package com.alex.logger;

import java.io.File;
import java.io.IOException;

public class Logger {
    public static void main(String[] args) throws IOException {
        File file = new File("log.txt");
        if (!file.exists()) {
            try {
                boolean created = file.createNewFile();
                if(created){
                   System.out.println("Created");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

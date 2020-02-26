package com.alex.logger;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BaseLogger {
    private static File file = new File("log.txt");

    //    public static final List<OutputStream> output = new ArrayList<OutputStream>();
    private static void createdFile() {
        if (!file.exists()) {
            try {
                boolean created = file.createNewFile();
                if (created) {
                    writeToFile("created");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void writeToFile(String log) {
        if (!file.exists()) {
            createdFile();
            try (FileWriter writer = new FileWriter(file, true)) {
                char[] temp = log.toCharArray();
                writer.write(temp);
                writer.write("\n" + "");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}

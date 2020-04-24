package com.alex.file_manager;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FileGid {
    private StringBuilder currentPath;
    private Scanner scanner = new Scanner(System.in);

    public File pave() {
        while (true) {
            try {
                chooseRoot();
                printCurFileContent();
                run();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                currentPath = new StringBuilder();
            }
        }
    }

    private File run() {
        while (true) {
            String input = scanner.nextLine();
            implInput(input);
        }
    }


    private void implInput(String input) {
        input = input.trim();
        if (input.startsWith("cd ")) {
            input = input.substring(3);
            chooseDestination(input);
        }
        if(input.startsWith("show")){
            showFiles();
        }
        if(input.startsWith("delete")){
            System.out.println("Enter name");
            String name = scanner.nextLine();
            deleteFile(name);
        }
    }

    private void chooseDestination(String input) {
        input = input.trim();
        String[] pathParts = input.split("\\\\");
        for (String path : pathParts) {
            if (path.equals("..")) {
                if (currentPath.indexOf("\\") != currentPath.lastIndexOf("\\")) {
                    String newPath = currentPath.toString().replaceAll("\\\\[a-zA-Z0-9]*\\\\$", "\\\\");
                    currentPath = new StringBuilder(newPath);
                    printCurFileContent();
                } else {
                    chooseRoot();
                }
            } else {
                currentPath.append(path).append("\\");
                printCurFileContent();
            }
        }
    }


    private void chooseRoot() {
        currentPath = new StringBuilder();
        File[] roots = File.listRoots();
        System.out.println(Arrays.toString(roots));
        while (currentPath.length() == 0) {
            String input = scanner.nextLine();
            for (File file : roots) {
                String path = file.getPath();
                if (path.startsWith(input) || path.equalsIgnoreCase(input) || (path).equalsIgnoreCase(input + ":\\")) {
                    currentPath.append(path);
                    return;
                }
            }
        }
    }

    private void printCurFileContent() {
        File file = new File(currentPath.toString());
        if (!file.exists()) {
            throw new IllegalStateException("File do not exists");
        }
        File[] files = file.listFiles();
        if (files != null) {
            for (File innerFile : files) {
                System.out.println(innerFile);
            }
        } else {
            System.out.println("Directory is empty");
        }
    }

    private   void showFiles(){
        File file = new File(String.valueOf(currentPath));
        System.out.println(Arrays.toString(file.list()));
    }

    private void deleteFile(String name){
        File file = new File(String.valueOf(currentPath),String.valueOf(name));
        if(file.delete()){
            System.out.println("File " + name + " deleted");
        }else {
            System.out.println("File not exist");
        }
    }


    public static void main(String[] args) {
        FileGid gid = new FileGid();
        gid.pave();

//        String s = "C:\\adwqa\\awdawfgvesrvgfer\\qwe\\";
//        System.out.println(s.replaceAll("\\\\[a-zA-Z0-9]*\\\\$", "\\\\"));
//        return;
    }
}

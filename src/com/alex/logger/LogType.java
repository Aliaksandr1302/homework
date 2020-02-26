package com.alex.logger;

public enum LogType {
    Info("Info"), Warning("Warning"), Error("Error");

    private String text;

    LogType(String text) {
        this.text = text;
    }

//    public static String getLogType() {
//        return text;
//    }
}

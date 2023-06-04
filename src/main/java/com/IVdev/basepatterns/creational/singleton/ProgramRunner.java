package com.IVdev.basepatterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.returnProgramLogger().toString());
        System.out.println(ProgramLogger.returnProgramLogger().toString());
        System.out.println(ProgramLogger.returnProgramLogger().toString());
        ProgramLogger.returnProgramLogger().addLogInfo("First log...");
        ProgramLogger.returnProgramLogger().addLogInfo("Second log...");
        ProgramLogger.returnProgramLogger().addLogInfo("Third log...");

        ProgramLogger.returnProgramLogger().showLogFile();
    }
}

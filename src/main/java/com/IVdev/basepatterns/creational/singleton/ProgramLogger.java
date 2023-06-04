package com.IVdev.basepatterns.creational.singleton;

//сделаем класс синглтоном
public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file \n\n";

    //метод для создания одиночки
    public static synchronized ProgramLogger returnProgramLogger() {
        if(programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {}

    public void addLogInfo(String logInfo) {
        logFile+= logInfo +"\n\n";
    }

    //содержимое log-файла
    public void showLogFile() {
        System.out.println(logFile);
    }
}

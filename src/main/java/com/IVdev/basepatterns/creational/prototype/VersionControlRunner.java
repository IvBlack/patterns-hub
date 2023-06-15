package com.IVdev.basepatterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperPro",
                "SourceCode sourceCode = new SourceCode();\n");
        System.out.println(master);

//        приведение типов в клиентском коде - плохая практика
        //Project masterClone = (Project)master.copy();

        //поэтому используем фабрику
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("\n============================\n");
        System.out.println(masterClone);
    }
}

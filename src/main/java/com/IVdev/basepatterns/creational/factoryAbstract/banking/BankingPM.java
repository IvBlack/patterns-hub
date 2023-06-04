package com.IVdev.basepatterns.creational.banking;

import com.IVdev.basepatterns.creational.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM manages banking project..");
    }
}

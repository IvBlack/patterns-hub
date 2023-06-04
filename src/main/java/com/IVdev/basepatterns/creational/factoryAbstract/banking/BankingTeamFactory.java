package com.IVdev.basepatterns.creational.factoryAbstract.banking;

import com.IVdev.basepatterns.creational.factoryAbstract.Developer;
import com.IVdev.basepatterns.creational.ProjectManager;
import com.IVdev.basepatterns.creational.factoryAbstract.ProjectTeamFactory;
import com.IVdev.basepatterns.creational.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return (Developer) new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new com.IVdev.basepatterns.creational.banking.QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new com.IVdev.basepatterns.creational.banking.BankingPM();
    }
}

package com.IVdev.basepatterns.creational.banking;

import com.IVdev.basepatterns.creational.Developer;
import com.IVdev.basepatterns.creational.ProjectManager;
import com.IVdev.basepatterns.creational.ProjectTeamFactory;
import com.IVdev.basepatterns.creational.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}

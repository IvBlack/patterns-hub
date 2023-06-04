package com.IVdev.basepatterns.creational.factoryAbstract.website;

import com.IVdev.basepatterns.creational.factoryAbstract.Developer;
import com.IVdev.basepatterns.creational.ProjectManager;
import com.IVdev.basepatterns.creational.Tester;
import com.IVdev.basepatterns.creational.factoryAbstract.ProjectTeamFactory;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}

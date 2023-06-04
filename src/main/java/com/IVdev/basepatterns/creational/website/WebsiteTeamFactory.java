package com.IVdev.basepatterns.creational.website;

import com.IVdev.basepatterns.creational.Developer;
import com.IVdev.basepatterns.creational.ProjectManager;
import com.IVdev.basepatterns.creational.ProjectTeamFactory;
import com.IVdev.basepatterns.creational.Tester;

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

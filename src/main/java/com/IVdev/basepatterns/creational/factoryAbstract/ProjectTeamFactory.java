package com.IVdev.basepatterns.creational.factoryAbstract;

import com.IVdev.basepatterns.creational.ProjectManager;
import com.IVdev.basepatterns.creational.Tester;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}

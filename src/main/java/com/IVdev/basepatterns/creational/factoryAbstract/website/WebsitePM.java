package com.IVdev.basepatterns.creational.factoryAbstract.website;

import com.IVdev.basepatterns.creational.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages website project...");
    }
}

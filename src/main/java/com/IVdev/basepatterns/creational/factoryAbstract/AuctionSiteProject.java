package com.IVdev.basepatterns.creational.factoryAbstract;

import com.IVdev.basepatterns.creational.ProjectManager;
import com.IVdev.basepatterns.creational.Tester;
import com.IVdev.basepatterns.creational.factoryAbstract.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        WebsiteTeamFactory websiteTeamFactory = new WebsiteTeamFactory();
        Developer developer = websiteTeamFactory.getDeveloper();
        Tester tester = websiteTeamFactory.getTester();
        ProjectManager projectManager = websiteTeamFactory.getProjectManager();

        System.out.println("Crating website project...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}

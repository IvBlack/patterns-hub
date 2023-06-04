package com.IVdev.basepatterns.creational;

import com.IVdev.basepatterns.creational.website.WebsiteTeamFactory;

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

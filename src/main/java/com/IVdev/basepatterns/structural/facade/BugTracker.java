package com.IVdev.basepatterns.structural.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active.");
    }

    public void finishSprint() {
        System.out.println("Sprint is not active.");
        activeSprint = false;
    }
}

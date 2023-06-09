package com.IVdev.basepatterns.structural.facade;

//класс-фасад, в себе компонует элементы системы
//клиент взаимодействует с логикой через фасад
public class WorkFlow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}

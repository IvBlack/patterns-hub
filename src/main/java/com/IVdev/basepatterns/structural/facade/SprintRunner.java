package com.IVdev.basepatterns.structural.facade;

import com.IVdev.basepatterns.structural.decorator.DeveloperDecorator;

//клиент взаимодействует с логикой через фасад
public class SprintRunner {
    public static void main(String[] args) {
        WorkFlow workFlow = new WorkFlow();
        workFlow.solveProblems();
    }
}

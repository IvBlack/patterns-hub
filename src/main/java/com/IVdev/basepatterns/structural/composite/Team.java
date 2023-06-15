package com.IVdev.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

//есть тима разработчиков, в которую можно добавлять/удалять сколь угодно
//разных разработчиков
public class Team {
    private List<Developer> developers = new ArrayList<Developer>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project ..\n\n");
        for(Developer developer : developers) {
            developer.writeCode();
        }
    }
}

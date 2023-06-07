package com.IVdev.basepatterns.composite;

public class Project {
    public static void main(String[] args) {
        //команда разработчиков
        Team team = new Team();

        //несколько разработчиков
        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        //добавим разработчиков в команду
        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        //пишем код
        team.createProject();
    }
}

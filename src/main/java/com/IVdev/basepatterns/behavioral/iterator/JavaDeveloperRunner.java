package com.IVdev.basepatterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String skills[] = {"Spring", "Hibernate", "Maven", "Postgres", "Java"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Ivan TheFourth", skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}

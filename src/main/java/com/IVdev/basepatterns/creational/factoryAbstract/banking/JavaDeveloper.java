package com.IVdev.basepatterns.creational.factoryAbstract.banking;


import com.IVdev.basepatterns.creational.factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev writes java-code...");
    }
}

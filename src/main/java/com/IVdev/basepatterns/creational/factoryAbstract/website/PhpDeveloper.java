package com.IVdev.basepatterns.creational.factoryAbstract.website;


import com.IVdev.basepatterns.creational.factoryAbstract.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes PHP-code...");
    }
}

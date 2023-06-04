package com.IVdev.basepatterns.creational.website;

import com.IVdev.basepatterns.creational.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes PHP-code...");
    }
}

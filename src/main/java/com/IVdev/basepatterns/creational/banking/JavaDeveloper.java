package com.IVdev.basepatterns.creational.banking;

import com.IVdev.basepatterns.creational.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev writes java-code...");
    }
}

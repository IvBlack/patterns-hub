package com.IVdev.basepatterns.structural.bridge;

public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java dev writes java code ...");
    }
}

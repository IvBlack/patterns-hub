package com.IVdev.basepatterns.creational.factory;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDev();
    }
}

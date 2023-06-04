package com.IVdev.basepatterns.creational.factory;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDev();
    }
}

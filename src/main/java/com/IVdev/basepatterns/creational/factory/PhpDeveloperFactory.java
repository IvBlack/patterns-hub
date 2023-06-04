package com.IVdev.basepatterns.creational.factory;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDev();
    }
}

package com.IVdev.basepatterns.creational.factoryAbstract.website;

import com.IVdev.basepatterns.creational.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}

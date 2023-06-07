package com.IVdev.basepatterns.structural.adapter;

public class AdapterJavaToDatabase extends JavaApplication
        implements Database{

    //инжект методов класса в методы интерфейса
    @Override
    public void insert() {
        saveObject();
    }
    @Override
    public void update() {
        updateObject();
    }
    @Override
    public void select() {
        loadObject();
    }
    @Override
    public void remove() {
        deleteObject();
    }
}

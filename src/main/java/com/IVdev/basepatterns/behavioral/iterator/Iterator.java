package com.IVdev.basepatterns.behavioral.iterator;

public interface Iterator {
    //есть ли следующий элемент
    public boolean hasNext();

    //возврат объекта, если он есть
    public Object next();
}

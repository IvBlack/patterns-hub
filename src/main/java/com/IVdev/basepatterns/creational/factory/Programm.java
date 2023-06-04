package com.IVdev.basepatterns.creational.factory;

public class Programm {
    public static void main(String[] args) {
        //при увеличении числа разработчиков код становится громоздким
//        JavaDev javaDev = new JavaDev();
//        javaDev.writeJavaCode();
//
//        CppDev cppDev = new CppDev();
//        cppDev.writeCppCode();

        //так же можно сделать код гибче с помощью фабрики
//        Developer developer = new JavaDev();
//        developer.writeCode();

        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    //создание объекта при помощи параметра, передаваемого в метод
    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if(specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        }
        else {
            throw new RuntimeException(specialty + "is unavailable specialty");
        }
    }
}


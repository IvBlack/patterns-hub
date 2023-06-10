package com.IVdev.basepatterns.structural.proxy;

public class RealProject implements Project{
    //ссылка на проект
    private String url;

    //при вызове конструктора проект сразу загружается
    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading project from "+ url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }
}

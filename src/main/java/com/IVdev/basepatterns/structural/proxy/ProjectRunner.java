package com.IVdev.basepatterns.structural.proxy;

public class ProjectRunner {
    //только когда сработает метод run() - проект скачается и запустится
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/proselytear/realProject");
        project.run();
    }
}

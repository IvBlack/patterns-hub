package com.IVdev.basepatterns.behavioral.chain;

public class SimpleReportNotifier extends Notifier{

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying use simple report "+ message);
    }
}

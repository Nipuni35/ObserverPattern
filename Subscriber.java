package com.company.youTubeSubscriber;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String title) {
        System.out.println(name + ", You have a new notification from our channel, with subject to " + title);
    }
}

package com.company.youTubeSubscriber;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    List<Observer> obeservers = new ArrayList<Observer>();
    private String title;

    public YouTubeChannel(String title) {
        this.title = title;
    }

    @Override
    public void registerSubscriber(Observer observer) {
        obeservers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        obeservers.remove(observer);
    }

    @Override
    public void notifySubscriber(String title) {
        for (Observer observer :
                obeservers) {
            observer.update(title);
        }
    }

    @Override
    public void uploadVideo() {
        notifySubscriber(title);
    }
}

package com.company.youTubeSubscriber;

public interface Subject {
    void registerSubscriber(Observer observer);

    void removeSubscriber(Observer observer);

    void notifySubscriber(String title);

    void uploadVideo();
}

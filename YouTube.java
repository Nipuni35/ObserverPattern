package com.company.youTubeSubscriber;

public class YouTube {
    public static void main(String args[]) {
        Subject subject = new YouTubeChannel("Java Tutorial");
        Observer observer = new Subscriber("Henry");
        Observer observer1 = new Subscriber("John");
        Observer observer2 = new Subscriber("Harry");
        Observer observer3 = new Subscriber("Ron");
        subject.registerSubscriber(observer);
        subject.registerSubscriber(observer1);
        subject.registerSubscriber(observer2);
        subject.registerSubscriber(observer3);
        subject.uploadVideo();
        System.out.println("-----------------------------");
        subject.removeSubscriber(observer);
        subject.uploadVideo();
    }
}

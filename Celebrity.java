package com.company;
import java.util.ArrayList;
import java.util.List;
public class Celebrity implements Observable{
    private List<Observer> subscriber = new ArrayList<>();
    private List <String> notifications = new ArrayList<>();

    public void PostPhoto(String photo){
        this.notifications.add(photo);
        notifyAllObservers();
    }

    public void PostStories(String photo){
        this.notifications.add(photo);
        notifyAllObservers();
    }
    public void MakeLiveStream(String photo){
        this.notifications.add(photo);
        notifyAllObservers();
    }
    @Override
    public void register(Observer subscriber) {
        this.subscriber.add(subscriber);
    }

    @Override
    public void unregister(Observer subscriber) {
        this.subscriber.remove(subscriber);

    }

    @Override
    public void notifyAllObservers() {
        for(Observer observ: this.subscriber){
            observ.update(this.notifications);
        }
    }
}

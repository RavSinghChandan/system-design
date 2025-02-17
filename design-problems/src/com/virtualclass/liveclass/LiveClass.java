package com.virtualclass.liveclass;

import java.util.*;

public class LiveClass {
    private int id;
    String topic;
    private String startTime;
    private List<Observer> observers = new ArrayList<>();

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LiveClass(int id, String topic, String startTime) {
        this.id = id;
        this.topic = topic;
        this.startTime = startTime;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Live Class on " + topic + " starting at " + startTime);
        }
    }

    public void startClass() {
        System.out.println("Live Class on " + topic + " has started.");
        notifyObservers();
    }
}


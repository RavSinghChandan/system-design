package com.photoshare.feed;

import instagram.feed.FeedObserver;

import java.util.ArrayList;
import java.util.List;

public class FeedService {
    private List<FeedObserver> observers = new ArrayList<>();

    public void addObserver(FeedObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(FeedObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(int userId) {
        for (FeedObserver observer : observers) {
            observer.update(userId);
        }
    }

    public void getFeed(int userId) {
        System.out.println("Fetching feed for user " + userId);
        notifyObservers(userId);
    }
}

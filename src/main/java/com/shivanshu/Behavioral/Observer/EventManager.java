package com.shivanshu.Behavioral.Observer;

public interface EventManager {
    public void subscribe(String eventType, EventListener listener);
    public void unsubscribe(String eventType, EventListener listener);
    public void notify(String eventType, String data);
}

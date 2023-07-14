package com.shivanshu.Behavioral.Observer;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;

public class EventManagerImpl implements EventManager{
    private Map<String, List<EventListener>> listeners;

    @Override
    public void subscribe(String eventType, EventListener listener) {
        if (listeners == null) {
            listeners = new HashMap<>();
        }

        List<EventListener> eventListeners = listeners.get(eventType);
        if (eventListeners == null) {
            eventListeners = new LinkedList<>();
            listeners.put(eventType, eventListeners);
        }
        eventListeners.add(listener);
    }

    @Override
    public void unsubscribe(String eventType, EventListener listener) {
        if (listener == null) {
            return;
        }

        List<EventListener> eventListeners = listeners.getOrDefault(eventType, null);

        if (eventListeners == null) {
            return;
        }

        eventListeners.remove(listener);
    }

    @Override
    public void notify(String eventType, String data) {
        if (listeners == null) {
            return;
        }

        List<EventListener> eventListeners = listeners.getOrDefault(eventType, null);

        if (eventListeners == null) {
            return;
        }

        for (EventListener eventListener: eventListeners) {
            eventListener.update(eventType, data);
        }
    }
}

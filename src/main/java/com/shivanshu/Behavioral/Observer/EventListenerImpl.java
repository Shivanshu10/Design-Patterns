package com.shivanshu.Behavioral.Observer;

public class EventListenerImpl implements EventListener{

    @Override
    public void update(String eventType, String data) {
        System.out.println("EVENT OCCURED OF TYPE: "+eventType+" HAVING DATA: "+data);
    }
}

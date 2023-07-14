package com.shivanshu.Behavioral.Strategy;

public class WaterStrategy implements RouteStrategy {
    @Override
    public void go(String start, String end) {
        System.out.println("Going to "+start+" to "+end+" on Water");
    }
}

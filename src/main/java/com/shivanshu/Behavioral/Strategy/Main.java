package com.shivanshu.Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        RouteStrategy routeStrategy = new LandStrategy();

        Navigator navigator = new Navigator();

        navigator.setRouteStrategy(routeStrategy);
        navigator.go("Delhi", "Patiala");
    }
}

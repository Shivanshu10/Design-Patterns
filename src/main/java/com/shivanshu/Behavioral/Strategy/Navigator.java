package com.shivanshu.Behavioral.Strategy;

public class Navigator {
    private RouteStrategy routeStrategy;

    void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    void go(String start, String end) {
        routeStrategy.go(start, end);
    }
}

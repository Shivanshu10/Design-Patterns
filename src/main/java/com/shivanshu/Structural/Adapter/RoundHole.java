package com.shivanshu.Structural.Adapter;

import java.util.Objects;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fit(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}

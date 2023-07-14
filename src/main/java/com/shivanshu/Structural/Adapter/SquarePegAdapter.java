package com.shivanshu.Structural.Adapter;

public class SquarePegAdapter extends RoundPeg {
    SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return peg.getSide() * Math.sqrt(2) / 2;
    }
}

package com.shivanshu.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(10);

        SquarePeg squarePeg = new SquarePeg(5);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        if (hole.fit(squarePegAdapter)) {
            System.out.println("Fitted");
        } else {
            System.out.println("Unfit");
        }
    }
}

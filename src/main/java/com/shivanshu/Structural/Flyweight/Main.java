package com.shivanshu.Structural.Flyweight;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        System.out.println("Planting trees");
        forest.plantTree(0, 0, "Mango", "Yello", "Soft");
        forest.plantTree(0, 0, "Apple", "Red", "Big");

        System.out.println("Drawing");
        forest.draw();
    }
}

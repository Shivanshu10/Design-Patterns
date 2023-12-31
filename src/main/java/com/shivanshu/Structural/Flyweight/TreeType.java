package com.shivanshu.Structural.Flyweight;

public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing: "+this+" at x: "+x+" y: "+y);
    }

    @Override
    public String toString() {
        return "TreeType{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", texture='" + texture + '\'' +
                '}';
    }
}

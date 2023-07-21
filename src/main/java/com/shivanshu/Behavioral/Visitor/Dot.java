package com.shivanshu.Behavioral.Visitor;

public class Dot implements Shape{
    private int id;
    private int x;
    private int y;

    public Dot() {
    }

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving Shape from x: "+this.x +" y: "+this.y+" to x: "+x+" y: "+y);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Dot at x: "+x+" y: "+y);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId() {
        return id;
    }
}

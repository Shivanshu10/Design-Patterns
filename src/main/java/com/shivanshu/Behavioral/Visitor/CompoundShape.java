package com.shivanshu.Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        for (Shape shape: children) {
            shape.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Shape shape: children) {
            shape.draw();
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }
}

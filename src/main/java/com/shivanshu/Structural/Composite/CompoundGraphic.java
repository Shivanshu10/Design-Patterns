package com.shivanshu.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic graphic: graphics) {
            graphic.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic graphic: graphics) {
            graphic.draw();
        }
    }
}

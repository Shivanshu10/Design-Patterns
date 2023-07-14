package com.shivanshu.Structural.Composite;

import java.util.List;

public class ImageEditor {
    private CompoundGraphic all = new CompoundGraphic();

    void drawDot(int x, int y) {
        all.add(new Dot(x, y));
        all.draw();
    }

    void addGroup(List<Graphic> graphics) {
        CompoundGraphic group = new CompoundGraphic();
        for (Graphic graphic: graphics) {
            group.add(graphic);
        }
        all.add(group);
        all.draw();
    }
}

package com.shivanshu.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.drawDot(0, 0);

        System.out.println("Drawing line");
        List<Graphic> line = new ArrayList<>();

        int x=2, ye=5;
        for (int i = 0; i <= ye; i++) {
            line.add(new Dot(2, i));
        }

        editor.addGroup(line);
    }
}

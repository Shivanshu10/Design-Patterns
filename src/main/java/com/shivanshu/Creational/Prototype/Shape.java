package com.shivanshu.Creational.Prototype;

import java.util.Objects;

public abstract class Shape implements Cloneable {
    public int x;
    public int y;
    public String color;

    public Shape() {

    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        System.out.println("[*] Equal Called on Shape");
        if (!(object2 instanceof Shape)) {
            return false;
        }
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}

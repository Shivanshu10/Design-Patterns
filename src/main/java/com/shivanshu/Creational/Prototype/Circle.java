package com.shivanshu.Creational.Prototype;

public class Circle extends Shape {
    public int radius;

    public Circle() {

    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        // can access private variable
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        System.out.println("[*] Equal Called on Circle");
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}

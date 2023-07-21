package com.shivanshu.Behavioral.Visitor;

public class XMLExporterVisitor implements Visitor{
    public String export(Shape shape) {
        shape.accept(this);
        return "";
    }
    @Override
    public String visitDot(Dot dot) {
        System.out.println("Visit Dot");
        return "";
    }

    @Override
    public String visitCircle(Circle circle) {
        System.out.println("Visit Circle");
        return "";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        System.out.println("Visit Rectangle");
        return "";
    }

    @Override
    public String visitCompoundGraphic(CompoundShape cg) {
        System.out.println("Visit Compound");
        return "";
    }
}

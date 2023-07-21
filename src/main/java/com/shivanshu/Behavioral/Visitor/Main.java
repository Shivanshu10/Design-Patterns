package com.shivanshu.Behavioral.Visitor;

public class Main {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        XMLExporterVisitor xmlExporterVisitor = new XMLExporterVisitor();
        xmlExporterVisitor.export(dot);
    }
}

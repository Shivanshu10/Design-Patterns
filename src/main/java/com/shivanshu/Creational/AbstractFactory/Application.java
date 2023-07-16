package com.shivanshu.Creational.AbstractFactory;

public class Application {
    private GuiFactory factory;
    private Button button;

    public Application(GuiFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        System.out.println("Creating App UI");
        button = factory.createButton();
    }

    public void paint() {
        System.out.println("Painting App");
        button.paint();
    }
}

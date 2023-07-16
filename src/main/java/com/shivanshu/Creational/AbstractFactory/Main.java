package com.shivanshu.Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        GuiFactory factory;

        String OS = "Win";
        if (OS == "Win") {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.createUI();

        app.paint();
    }
}

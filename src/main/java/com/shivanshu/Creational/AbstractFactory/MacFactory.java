package com.shivanshu.Creational.AbstractFactory;

public class MacFactory implements GuiFactory {
    @Override
    public Button createButton() {
        System.out.println("Creating Mac type Button");
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        System.out.println("Creating Mac type Checkbox");
        return new MacCheckbox();
    }
}

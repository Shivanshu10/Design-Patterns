package com.shivanshu.Creational.AbstractFactory;

public class WinFactory implements GuiFactory {
    @Override
    public Button createButton() {
        System.out.println("Creating Win type Button");
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        System.out.println("Creating Win type Checkbox");
        return new WinCheckbox();
    }
}

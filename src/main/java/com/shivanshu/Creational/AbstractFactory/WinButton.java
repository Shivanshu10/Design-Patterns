package com.shivanshu.Creational.AbstractFactory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting Win type Button");
    }
}

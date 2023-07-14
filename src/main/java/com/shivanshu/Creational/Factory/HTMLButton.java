package com.shivanshu.Creational.Factory;

public class HTMLButton implements Button {
    private CloseDialogFunc onClickFunc;
    @Override
    public void render() {
        System.out.println("Render HTML style Button");
    }

    @Override
    public void onClick(CloseDialogFunc closeDialogFunc) {
        System.out.println("HTML Button onClick Declared!!!");
        this.onClickFunc = closeDialogFunc;
    }

    @Override
    public void click() {
        System.out.println("HTML button got Clicked");
        onClickFunc.closeDialog();
    }
}

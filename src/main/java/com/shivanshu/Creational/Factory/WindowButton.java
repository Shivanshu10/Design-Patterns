package com.shivanshu.Creational.Factory;

public class WindowButton implements Button{
    private CloseDialogFunc onClickFunc;
    @Override
    public void render() {
        System.out.println("Render button in window style");
    }

    @Override
    public void onClick(CloseDialogFunc closeDialogFunc) {
        System.out.println("Window Button onClick Declared!!!");
        this.onClickFunc = closeDialogFunc;
    }

    @Override
    public void click() {
        System.out.println("Window button got Clicked");
        onClickFunc.closeDialog();
    }


}

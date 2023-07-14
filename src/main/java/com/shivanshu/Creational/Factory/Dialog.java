package com.shivanshu.Creational.Factory;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

public abstract class Dialog {
    Button button;
    abstract Button createButton();
    public void render() {
        button = createButton();
        CloseDialogFunc closeDialogFunc = new CloseDialogFuncImpl();
        button.onClick(closeDialogFunc);
        button.render();
    }
}

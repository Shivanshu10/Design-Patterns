package com.shivanshu.Behavioral.ChainOfCommand;

public class Dialog extends Container {

    public void showMessage() {
        System.out.println("Inside Dialog Help");
        if (tooltip != null) {
            System.out.println("Tooltip: "+tooltip);
        } else {
            System.out.println("Dialog Tooltip is Null");
            super.showMessage();
        }
    }
}

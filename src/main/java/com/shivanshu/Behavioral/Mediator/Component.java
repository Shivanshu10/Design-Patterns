package com.shivanshu.Behavioral.Mediator;

public abstract class Component {
    private Mediator dialog;

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }

    public abstract void click();

    public void notify(String event) {
        this.dialog.notify(this, event);
    }

    public void hide() {
        System.out.println("Hiding Component");
    }

    public void unhide() {
        System.out.println("Unhiding Component");
    }
}

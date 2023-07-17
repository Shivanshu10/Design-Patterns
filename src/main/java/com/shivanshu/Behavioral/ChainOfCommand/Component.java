package com.shivanshu.Behavioral.ChainOfCommand;

public class Component implements ComponentWithContextHelp {
    protected String tooltip = null;

    protected Container container;

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    @Override
    public void showMessage() {
        System.out.println("Inside Component Help");
        if (tooltip != null) {
            System.out.println("Tooltip: "+tooltip);
        } else {
            System.out.println("Component Tooltip is Null");
            container.showMessage();
        }
    }
}

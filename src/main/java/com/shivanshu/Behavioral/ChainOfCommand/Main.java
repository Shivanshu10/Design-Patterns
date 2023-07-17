package com.shivanshu.Behavioral.ChainOfCommand;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        dialog.setTooltip("Dialog box tooltip");

        Button showHelp = new Button();
        dialog.add(showHelp);

        showHelp.showMessage();
    }
}

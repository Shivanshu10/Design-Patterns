package com.shivanshu.Creational.Factory;

public class Main {
    public static void main(String[] args) throws Exception{
        String config = "Windows";
        Dialog dialog;

        if (config == "Windows") {
            dialog = new WindowDialog();
        } else if (config == "Web") {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error!! Unown OS");
        }

        dialog.render();
        dialog.button.click();
    }
}

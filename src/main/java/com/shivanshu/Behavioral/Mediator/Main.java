package com.shivanshu.Behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        AuthenticationDialog dialog = new AuthenticationDialog();

        System.out.println("Clicking on Ok btn");
        dialog.cancelBtn.click();

        System.out.println("Clicking on Checkbox");
        dialog.loginOrRegisterCheckbox.click();

        System.out.println("Clicking on Checkbox Again");
        dialog.loginOrRegisterCheckbox.click();
    }
}

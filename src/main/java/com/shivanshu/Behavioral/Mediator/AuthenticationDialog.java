package com.shivanshu.Behavioral.Mediator;

public class AuthenticationDialog implements Mediator {
    public String title;
    public Checkbox loginOrRegisterCheckbox;
    public TextBox loginUsername;
    public TextBox loginPassword;
    public TextBox registrationUsername;
    public TextBox registrationPassword;
    public TextBox registerationEmail;
    public Button okBtn;
    public Button cancelBtn;

    public AuthenticationDialog() {
        title = "notitle";
        loginOrRegisterCheckbox = new Checkbox(this);
        loginUsername = new TextBox(this);
        loginPassword = new TextBox(this);

        registrationUsername = new TextBox(this);
        registrationPassword = new TextBox(this);
        registerationEmail = new TextBox(this);

        okBtn = new Button(this);
        cancelBtn = new Button(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == loginOrRegisterCheckbox && event == "check") {
            System.out.println("Login Selected");

            System.out.println("Unhiding login");
            loginUsername.unhide();
            loginPassword.unhide();

            System.out.println("Hiding register");
            registrationUsername.hide();
            registrationPassword.hide();
            registerationEmail.hide();

            title = "Login";
        } else if (sender == loginOrRegisterCheckbox && event == "uncheck") {
            System.out.println("Register Selected");

            System.out.println("Hiding Login");
            loginUsername.hide();
            loginPassword.hide();

            System.out.println("Un-Hiding register");
            registrationUsername.unhide();
            registrationPassword.unhide();
            registerationEmail.unhide();

            title = "Register";
        } else {
            System.out.println("else event occured");
        }
    }
}

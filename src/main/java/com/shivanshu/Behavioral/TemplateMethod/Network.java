package com.shivanshu.Behavioral.TemplateMethod;

public abstract class Network {
    String userName;
    String password;

    Network() {}

    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result =  sendData(message);
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(String data);
    abstract void logOut();
}

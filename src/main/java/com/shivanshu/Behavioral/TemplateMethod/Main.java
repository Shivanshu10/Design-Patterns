package com.shivanshu.Behavioral.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        String userName = "Shivanshu";
        String password = "Mishra";
        String postMessage = "Hello World!!!";

        Network network = new Facebook(userName, password);
        network.post(postMessage);
    }
}

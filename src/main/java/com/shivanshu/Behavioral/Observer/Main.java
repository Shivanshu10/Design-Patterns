package com.shivanshu.Behavioral.Observer;


public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManagerImpl();
        Editor editor = new Editor(eventManager);

        EventListener fileSaved = new EventListenerImpl();

        eventManager.subscribe("FileSaved", fileSaved);

        editor.openFile("somePath");

        editor.saveFile();

        editor.closeFile();
    }
}

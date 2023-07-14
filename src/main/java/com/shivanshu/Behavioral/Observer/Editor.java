package com.shivanshu.Behavioral.Observer;

public class Editor {
    private EventManager eventManager = null;
    private String fileOpenedPath = null;
    public Editor(EventManager eventManager) {
        this.eventManager = eventManager;
    }
    public void openFile(String path) {
        this.fileOpenedPath = path;
        System.out.println("Openting file: "+path);
        eventManager.notify("FileOpen", path);
    }
    public void saveFile() {
        if (fileOpenedPath == null) {
            System.out.println("No File is Opened");
            eventManager.notify("Exception", "NoFIleOpenedStillSave");
            return;
        }
        System.out.println("Saving file: "+fileOpenedPath);
        eventManager.notify("FileSaved", fileOpenedPath);
    }

    public void closeFile() {
        if (fileOpenedPath == null) {
            System.out.println("No File is Opened");
            eventManager.notify("Exception", "NoFIleOpenedStillClose");
            return;
        }
        System.out.println("Closing file: "+fileOpenedPath);
        eventManager.notify("FileClosed", fileOpenedPath);
    }
}

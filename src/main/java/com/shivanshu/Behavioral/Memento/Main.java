package com.shivanshu.Behavioral.Memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        Command command = new Command();

        editor.setText("Hello World");
        command.makeBackup(editor);
        System.out.println("Curr state");
        System.out.println(editor);

        System.out.println("Changing state");
        editor.setText("Out of Time");
        System.out.println("New State");
        System.out.println(editor);

        System.out.println("Undoing");
        command.restore();
        System.out.println("Restored");
        System.out.println(editor);
    }
}

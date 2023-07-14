package com.shivanshu.Behavioral.Command;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor(new TextField());

        Command copyCommand = new CopyCommand(editor);
        Command pasteCommand1 = new PasteCommand(editor);
        Command pasteCommand2 = new PasteCommand(editor);
        Command cutCommand = new CutCommand(editor);

        System.out.println("Writing text");
        String toWrite = "Hello World";
        for (int i=0; i<toWrite.length(); i++) {
            editor.textfield.write(toWrite.charAt(i));
        }
        System.out.println("TextField: "+editor.textfield.getText());

        editor.textfield.select(0, 5);

        System.out.println("\nCopy & Paste");
        editor.execute(copyCommand);
        editor.execute(pasteCommand1);
        System.out.println("TextField: "+editor.textfield.getText());

        System.out.println("\nCut & Paste");
        editor.execute(cutCommand);
        editor.execute(pasteCommand2);
        System.out.println("TextField: "+editor.textfield.getText());

        System.out.println("\nUndoing");
        editor.undo();
        editor.undo();
        editor.undo();
        System.out.println("TextField: "+editor.textfield.getText());
    }
}

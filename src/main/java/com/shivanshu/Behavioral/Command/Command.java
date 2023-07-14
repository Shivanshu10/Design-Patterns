package com.shivanshu.Behavioral.Command;

public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    // save current state of editor
    void backup() {
        backup = editor.textfield.getText();
    }

    // set textfield to backup
    void undo() {
        editor.textfield.setText(backup);
    }

    public abstract boolean execute();
}

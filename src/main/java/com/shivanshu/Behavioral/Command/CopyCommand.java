package com.shivanshu.Behavioral.Command;

public class CopyCommand extends Command {

    CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        System.out.println("Copying text");
        editor.clipboard = editor.textfield.getSelected();
        return false;
    }
}

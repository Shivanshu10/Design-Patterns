package com.shivanshu.Behavioral.Command;

public class PasteCommand extends Command {
    PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) {
            System.out.println("Nothing to paste");
            return false;
        }
        backup();
        System.out.println("Pasting data");
        editor.textfield.insert(editor.clipboard, editor.textfield.getCaretPosition());
        return true;
    }
}

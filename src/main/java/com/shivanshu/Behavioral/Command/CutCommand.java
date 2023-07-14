package com.shivanshu.Behavioral.Command;

public class CutCommand extends Command{
    CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textfield.getSelected().isEmpty()) {
            System.out.println("Nothing selected to cut");
            return false;
        }
        System.out.println("Cutting");
        backup();
        String source = editor.textfield.getText();
        editor.clipboard = editor.textfield.getSelected();
        editor.textfield.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textfield.getSelectionStart());
        String end = source.substring(editor.textfield.getSelectionEnd());
        return start + end;
    }
}

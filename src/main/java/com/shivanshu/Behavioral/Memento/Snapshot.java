package com.shivanshu.Behavioral.Memento;

public class Snapshot {
    private Editor editor;
    private String text;
    private int currX;
    private int currY;
    private int selectionWidth;

    public Snapshot(Editor editor, String text, int currX, int currY, int selectionWidth) {
        this.editor = editor;
        this.text = text;
        this.currX = currX;
        this.currY = currY;
        this.selectionWidth = selectionWidth;
    }

    void restore() {
        editor.setText(text);
        editor.setCursor(currX, currY);
        editor.setSelectionWidth(selectionWidth);
    }
}

package com.shivanshu.Behavioral.Memento;

public class Editor {
    private String text;
    private int currX;
    private int currY;
    private int selectionWidth;

    void setText(String text) {
        this.text = text;
    }

    void setCursor(int x, int y) {
        this.currX = x;
        this.currY = y;
    }

    void setSelectionWidth(int width) {
        this.selectionWidth = width;
    }

    Snapshot createSnapshot() {
        return new Snapshot(this, text, currX, currY, selectionWidth);
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                ", currX=" + currX +
                ", currY=" + currY +
                ", selectionWidth=" + selectionWidth +
                '}';
    }
}

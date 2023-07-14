package com.shivanshu.Behavioral.Command;

public class TextField {
    String text = "";
    int selectionStart;
    int selectionEnd;
    int caretPosition=0;

    public void write(Character c) {
        text += c;
        caretPosition++;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void select(int s, int e) {
        System.out.println("Selecting text from "+s+" to "+e);
        selectionStart = s;
        selectionEnd = e;
    }

    public String getSelected() {
        return text.substring(selectionStart, selectionEnd);
    }

    public int getSelectionStart() {
        return selectionStart;
    }

    public int getSelectionEnd() {
        return selectionEnd;
    }

    public int getCaretPosition() {
        return caretPosition;
    }

    public void insert(String str, int pos) {
        String newString = new String();

        for (int i = 0; i <= text.length(); i++) {
            if (i<text.length()) {
                newString += text.charAt(i);
            }

            if (i == pos) {
                newString += str;
            }
        }

        text = newString;
    }

    public void setCaretPosition(int caretPosition) {
        System.out.println("Moving cursor");
        this.caretPosition = caretPosition;
    }
}

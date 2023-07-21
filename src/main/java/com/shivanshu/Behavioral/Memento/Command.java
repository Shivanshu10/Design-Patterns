package com.shivanshu.Behavioral.Memento;

public class Command {
    private Snapshot backup;

    void makeBackup(Editor editor) {
        backup = editor.createSnapshot();
    }

    void restore() {
        if (backup != null) {
            backup.restore();
        }
    }
}

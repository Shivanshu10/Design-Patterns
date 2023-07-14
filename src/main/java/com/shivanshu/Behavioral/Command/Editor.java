package com.shivanshu.Behavioral.Command;

public class Editor {
    public TextField textfield;
    public String clipboard;
    private CommandHistory history = new CommandHistory();

    public Editor(TextField textfield) {
        this.textfield = textfield;
    }

    public void execute(Command command) {
        boolean status = command.execute();

        if (status == true) {
            history.push(command);
        }
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}

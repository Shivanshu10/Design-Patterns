package com.shivanshu.Behavioral.Mediator;

public class TextBox extends Component{
    public TextBox(Mediator dialog) {
        super(dialog);
    }

    @Override
    public void click() {
        System.out.println("Textbox writtable");
        super.notify("writtable");
    }
}

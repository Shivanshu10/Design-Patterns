package com.shivanshu.Behavioral.Mediator;

public class Button extends Component {
    public Button(Mediator dialog) {
        super(dialog);
    }

    @Override
    public void click() {
        System.out.println("Button clicked");
        super.notify("click");
    }
}

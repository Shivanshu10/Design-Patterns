package com.shivanshu.Behavioral.Mediator;

public class Checkbox extends Component{
    boolean checked = false;

    public Checkbox(Mediator dialog) {
        super(dialog);
    }

    @Override
    public void click() {
        checked = !checked;
        if (checked) {
            super.notify("check");
        } else {
            super.notify("uncheck");
        }
    }
}

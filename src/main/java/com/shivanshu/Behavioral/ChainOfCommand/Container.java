package com.shivanshu.Behavioral.ChainOfCommand;

import java.util.LinkedList;
import java.util.List;

public class Container extends Component {
    protected List<Component> components = new LinkedList<>();

    public void add(Component component) {
        components.add(component);
        component.container = this;
    }
}

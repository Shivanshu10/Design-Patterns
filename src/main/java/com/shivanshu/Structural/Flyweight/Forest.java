package com.shivanshu.Structural.Flyweight;

import java.util.LinkedList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new LinkedList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType treeType = TreeFactory.getTreeType(name, color, texture);

        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    public void draw() {
        for (Tree tree: trees) {
            tree.draw();
        }
    }
}

package com.shivanshu.Structural.Flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treesTypes = new HashMap<>();
    static TreeType getTreeType(String name, String color, String texture) {
        TreeType treeType = treesTypes.get(TreeFactory.getHashForAttrib(name, color, texture));

        if (treeType == null) {
            treeType = new TreeType(name, color, texture);
            treesTypes.put(treeType.toString(), treeType);
        }
        return treeType;
    }
    static String getHashForAttrib(String name, String color, String texture) {
        return "TreeType{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", texture='" + texture + '\'' +
                '}';
    }
}

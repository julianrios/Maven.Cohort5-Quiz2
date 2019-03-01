package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Set;

public class Router {
    HashMap<String, String> tree;

    public Router() {
        this.tree = new HashMap<>();
    }

    public void add(String path, String controller) {
        tree.put(path, controller);
    }

    public Integer size() {
        return tree.size();
    }

    public String getController(String path) {
        return tree.get(path);
    }

    public void update(String path, String studentController) {
        tree.put(path, studentController);
    }

    public void remove(String path) {
        tree.remove(path);
    }

    @Override
    public String toString() {
        String pathName = "";
        Set<String> routerPaths = tree.keySet();
        for(String path : routerPaths) {
            pathName = (path + " -> " + getController(path) + "\n") + pathName;
        }
        return pathName;
//        String routerPath = tree.toString().replace("{", "")
//                .replace("=", " -> ")
//                .replace(", ", "\n")
//                .replace("}", "")+"\n";
//        return routerPath;
    }
}

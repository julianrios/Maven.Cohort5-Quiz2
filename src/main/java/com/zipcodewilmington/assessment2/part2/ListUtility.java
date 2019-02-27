package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    private List test;

    public ListUtility() {
        this.test = new ArrayList();
    }

    public Boolean add(int i) {
        if(contains(i)) {
            return true;
        }
        test.add(i);
        return false;
    }

    public Integer size() {
        return test.size();
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        if(test.contains(valueToAdd)) {
            return true;
        }
        return false;
    }
}

package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListUtility {
    private List<Integer> test;

    public ListUtility() {
        this.test = new ArrayList();
    }

    public Boolean add(Integer i) {
        return test.add(i);
    }

    public Integer size() {
        return test.size();
    }

    public List<Integer> getUnique() {
        return new ArrayList<>(new HashSet<>(test));
    }

    public String join() {
        String formatNumber = test.toString();
        return formatNumber.substring(1,formatNumber.length()-1);
    }

    public Integer mostCommon() {
        Integer[] convertedList = test.toArray(new Integer[0]);
        ArrayUtility arrayUtil = new ArrayUtility();
        return arrayUtil.mostCommon(convertedList);
    }

    public Boolean contains(Integer valueToAdd) {
        if(test.contains(valueToAdd)) {
            return true;
        }
        return false;
    }
}

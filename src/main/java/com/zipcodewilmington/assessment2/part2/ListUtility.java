package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    private List<Integer> list = new ArrayList();

//    public ListUtility() {
//        this.list = new ArrayList();
//    }

    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        List<Integer> unique = new ArrayList<>();

        for(Integer number : list) {
            if(!(unique.contains(number))) {
                unique.add(number);
            }
        }

        return unique;
//        return new ArrayList<>(new HashSet<>(list));
    }

    public String join() {
        String removeAngleBrackets = list.toString();
        return removeAngleBrackets.substring(1,removeAngleBrackets.length()-1);

//        String result = "";
//
//        for(int i = 0; i < list.size(); i++) {
//            result += list.get(i);
//            if (i < list.size() - 1) {
//                result += ", ";
//            }
//        }
//
//        return result;
    }

//    public <T> int count(List<T> list, Integer valueToCount) {
//        int count = 0;
//
//        for(T number: list) {
//            if(number == valueToCount) {
//                count++;
//            }
//        }
//        return count;
//    }

    public Integer mostCommon() {
        Integer[] convertedList = list.toArray(new Integer[0]);
        ArrayUtility arrayUtil = new ArrayUtility();
        return arrayUtil.mostCommon(convertedList);
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}

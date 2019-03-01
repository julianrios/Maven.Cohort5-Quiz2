package com.zipcodewilmington.assessment2.part2;


import java.util.Arrays;
import java.util.Collections;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] merged = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return merged;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return merge(Arrays.copyOfRange(array, index, array.length), Arrays.copyOfRange(array, 0, index));
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer totalCountOccurrence = getNumberOfOccurrences(array1, valueToEvaluate)
                + getNumberOfOccurrences(array2, valueToEvaluate);
        return totalCountOccurrence;
    }

    public Integer countOccurrence(Integer[] array1, Integer valueToEvaluate) {
        return Collections.frequency(Arrays.asList(array1), valueToEvaluate);
    }

    public Integer mostCommon(Integer[] array) {
        Integer mostCommon = array[0];
        Integer mostCommonCOunt = 0;
        for(Integer number : array) {
            int occurences = countOccurrence(array, number);
                if(occurences > mostCommonCOunt) {
                    mostCommon = number;
                    mostCommonCOunt = occurences;
                }
            }
        return mostCommon;




//        int count = 1;
//        int tempCount = 0;
//        Integer popular = array[0];
//        Integer temp = null;
//        for (int i = 0; i < array.length-1; i ++) {
//            temp = array[i];
//            tempCount = 0;
//            for (int j = 1; j < array.length; j++) {
//                if(temp.equals(array[j])) {
//                    tempCount++;
//                }
//                if (tempCount > count) {
//                    popular = temp;
//                    count = tempCount;
//                }
//            }
//        }
//        return popular;
    }

    Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for(Object number : objectArray) {
            if(number.equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }
}

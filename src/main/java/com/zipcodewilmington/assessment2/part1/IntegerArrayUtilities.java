package com.zipcodewilmington.assessment2.part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if(array.length % 2==0) {
            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {
        int[] range = IntStream.rangeClosed(start, stop).toArray();
        Integer[] integerArray = Arrays.stream( range ).boxed().toArray( Integer[]::new );
        return integerArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer sum = array[0] + array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer product = array[0] * array[1];
        return product;
    }
}

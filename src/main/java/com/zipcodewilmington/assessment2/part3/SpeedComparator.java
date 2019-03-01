package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal animalOne, Animal animalTwo) {
        return animalTwo.getSpeed()-animalOne.getSpeed();
    }
}

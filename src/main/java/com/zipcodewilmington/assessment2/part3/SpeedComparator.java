package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal animalOne, Animal animalTwo) {
        return animalTwo.getSpeed()-animalOne.getSpeed();

//        Integer animal1Speed = animal1.getSpeed();
//        Integer animal2Speed = animal2.getSpeed();
//
//        if (animal1Speed == animal2Speed) {
//            return 0;
//        } else if (animal1Speed > animal2Speed) {
//            return -1;
//        } else {
//            return 1;
//        }

        // another way to answer this without the if statement
//        return animalTwo.compareTo(animalOne);

    }


}

package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird{

    public int getSpeed() {
        return 2;
    }

    @Override
    public String color() {
        return "blue";
    }

    @Override
    public String move() {
        return "fly";
    }

}

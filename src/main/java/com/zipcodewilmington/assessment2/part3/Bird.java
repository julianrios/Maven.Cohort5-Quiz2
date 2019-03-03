package com.zipcodewilmington.assessment2.part3;

public abstract class Bird implements Animal{
    // abstract classes you can define behaviour and show this is common within other the classes
    // so do this you also do not need to implement all the methods within an interface if declared abstract
    @Override
    public String move() {
        return null;
    }

//    @Override
//    public int getSpeed() {
//        return 0;
//    }

    @Override
    public String color() {
        return null;
    }

    public void setMigrationMonth(String expected) {

    }

    public String getMigrationMonth() {
        return null;
    }
}

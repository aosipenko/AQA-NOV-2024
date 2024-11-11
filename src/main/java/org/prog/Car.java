package org.prog;

public class Car {

    public String color;

    public void goTo(String destination) {
        System.out.println("Going to " + destination);
        if (color.equals("green")) {
            System.out.println(color + " car is moving so fast!");
        } else {
            System.out.println(color + " car is moving so slow!");
        }
    }
}

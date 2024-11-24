package org.prog.homework3;
import org.prog.cars.Car;

public class ObjectPlane {
    public static void main(String[] args) {
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();

        plane1.flightId = "DF223";
        plane1.destination = "Odessa";
        plane1.airlines = "2";

        plane2.flightId = null;
        plane2.destination = "Odessa";
        plane2.airlines = "2";


        try {
            System.out.println(plane1.equals(plane2));
            System.out.println(plane1.hashCode());
            System.out.println(plane2.hashCode());
        } catch (NullPointerException e) {
            System.out.println("flight id is missing!");
        } finally {
            System.out.println("works anyway");


        }
    }
}

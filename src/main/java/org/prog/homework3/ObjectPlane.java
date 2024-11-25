package org.prog.homework3;
import org.prog.cars.Car;

public class ObjectPlane {
    public static void main(String[] args) {
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();

        plane1.flightId = "GFG55";
        plane1.destination = "Odessa";
        plane1.airlines = "2";

        plane2.flightId = null;
        plane2.destination = "Odessa";
        plane2.airlines = "2";


        try {
            System.out.println(plane2.equals(plane1));
            System.out.println(plane1.hashCode());
            System.out.println(plane2.hashCode());
        } catch (NullPointerException nullPointerException) {
            System.out.println("flight id is missing!");
        } finally {
            System.out.println("works anyway");


        }
    }
}

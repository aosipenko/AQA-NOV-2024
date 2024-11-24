package org.prog.homework3;

//TODO: write class Plane with fields "flightId", "destination", "airlines"
//TODO: write hashCode and Equals (see Car)
//TODO: compare planes with null flightId and catch exception, in catch write "flight id is missing"
//TODO: in try-catch-finally add finally and print "works anyway"
public class HomeWork3 {

    public static void main(String[] args) {
        // Example Plane objects
        Plane plane1 = new Plane("FL123", "New York", "Delta Airlines");
        Plane plane2 = new Plane(null, "London", "British Airways");

        try {
            // Attempt to compare plane1 with plane2
            System.out.println("Are planes equal? " + plane1.equals(plane2));

            // Explicitly testing a null flightId in plane2
            if (plane2.getFlightId() == null) {
                throw new NullPointerException("Flight ID is missing");
            }
        } catch (NullPointerException e) {
            // Catch block to handle missing flightId
            System.out.println(e.getMessage());
        } finally {
            // Always executed
            System.out.println("Works anyway");
        }
    }
}


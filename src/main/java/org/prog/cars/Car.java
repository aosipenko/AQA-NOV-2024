package org.prog.cars;

public class Car {


        public String color; // Color of the car

        public void goTo(String destination) {
            goTo(destination, "current location");
        }

        public void goTo(String destination, String from) {
            goTo(destination, from, "nowhere");
        }

        public void goTo(String destination, String from, String passingThrough) {
            goTo(destination, from, passingThrough, "no passengers");
        }

        public void goTo(String destination, String from, String passingThrough, String withPassenger) {
            System.out.println("Going from " + from + " to " + destination +
                    " stopping at " + passingThrough + " with " + withPassenger);
        }

        public void pickUpPassenger() {
            // Method to pick up a passenger
        }

        public int getColorLengthSafe() {
            if (color == null) {
                color = ""; // If color is not set, initialize it as an empty string
            }
            return getColorLength();
        }

        private int getColorLength() {
            return color.length(); // Returns the length of the color string
        }

        protected void smth() {
            // Protected method for internal use
        }

        String someString() {
            return "abc"; // Example method returning a string
        }


@Override
public String toString() {
    return "Car{" +
            "color='" + color + '\'' +
            '}';
}
}
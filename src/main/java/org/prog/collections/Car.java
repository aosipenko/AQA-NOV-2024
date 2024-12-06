package org.prog.collections;



    // Class representing a Car
    public class Car {
        private String name;

        public Car(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }

        // Override equals and hashCode to ensure Cars can be properly compared in collections
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Car car = (Car) obj;
            return name.equals(car.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }


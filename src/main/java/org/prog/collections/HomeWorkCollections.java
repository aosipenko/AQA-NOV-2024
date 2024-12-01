package org.prog.collections;

//TODO: Write code where single car be owned by multiple unique owners
//TODO: some cars can have multiple owners
//TODO: print owner names for all owners that share cars

// > Jane : Car1, Car2, Car3
// > John : Car4
// > Bill: Car1, Car5
// > Sarah : Car4
// > ...
// > ...

// >>>> Car1: Jane, Bill
// >>>> Car4: John, Sarah

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

    public class HomeWorkCollections {
        public static void main(String[] args) {
            // Map linking each car to its owners
            Map<Car, Set<Owner>> carToOwners = new HashMap<>();
            // Map linking each owner to their cars
            Map<Owner, Set<Car>> ownerToCars = new HashMap<>();

            // Create some cars
            Car car1 = new Car("Car1");
            Car car2 = new Car("Car2");
            Car car3 = new Car("Car3");
            Car car4 = new Car("Car4");
            Car car5 = new Car("Car5");

            // Create some owners
            Owner jane = new Owner("Jane");
            Owner john = new Owner("John");
            Owner bill = new Owner("Bill");
            Owner sarah = new Owner("Sarah");

            // Assign cars to owners (allowing multiple owners per car)
            addCarOwner(carToOwners, ownerToCars, car1, jane);
            addCarOwner(carToOwners, ownerToCars, car1, bill);
            addCarOwner(carToOwners, ownerToCars, car2, jane);
            addCarOwner(carToOwners, ownerToCars, car3, jane);
            addCarOwner(carToOwners, ownerToCars, car4, john);
            addCarOwner(carToOwners, ownerToCars, car4, sarah);
            addCarOwner(carToOwners, ownerToCars, car5, bill);

            // Print cars and their owners
            System.out.println("Cars and their Owners:");
            for (Map.Entry<Car, Set<Owner>> entry : carToOwners.entrySet()) {
                System.out.print(">>>> " + entry.getKey().getName() + ": ");
                for (Owner owner : entry.getValue()) {
                    System.out.print(owner.getName() + " ");
                }
                System.out.println();
            }

            // Print owners and their cars
            System.out.println("\nOwners and their Cars:");
            for (Map.Entry<Owner, Set<Car>> entry : ownerToCars.entrySet()) {
                System.out.print(">>>> " + entry.getKey().getName() + ": ");
                for (Car car : entry.getValue()) {
                    System.out.print(car.getName() + " ");
                }
                System.out.println();
            }
        }

        // Utility method to add a car-owner relationship to both maps
        private static void addCarOwner(Map<Car, Set<Owner>> carToOwners, Map<Owner, Set<Car>> ownerToCars, Car car, Owner owner) {
            // Add the owner to the set of owners for the car
            carToOwners.computeIfAbsent(car, k -> new HashSet<>()).add(owner);
            // Add the car to the set of cars for the owner
            ownerToCars.computeIfAbsent(owner, k -> new HashSet<>()).add(car);
        }
    }


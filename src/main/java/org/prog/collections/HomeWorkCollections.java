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

import org.prog.cars.Car;

import java.util.*;

// >>>> Car1: Jane, Bill
// >>>> Car4: John, Sarah
public class HomeWorkCollections {

    public static void main(String[] args) {
        Map<Car, List<String>> carsAndOwners = new HashMap<>();

        List<String> randomOwners = Arrays.asList("Alla", "Alex", "Lora", "Lyudmila", "Dmytro", "Matvei", "Svetlana", "Sergey");

        addCarToCompany(carsAndOwners, "black", getRandomOwners(randomOwners));
        addCarToCompany(carsAndOwners, "white", getRandomOwners(randomOwners));
        addCarToCompany(carsAndOwners, "red", getRandomOwners(randomOwners));
        addCarToCompany(carsAndOwners, "blue", getRandomOwners(randomOwners));

        printCarsAndOwners(carsAndOwners);

    }
    public static void addCarToCompany(Map<Car, List<String>> carsAndOwners,
                                       String color, List<String> owners) {
        Car car = new Car();
        car.color = color;
        carsAndOwners.put(car, new ArrayList<>(owners));
    }
    public static void printCarsAndOwners(Map<Car, List<String>> carsAndOwners) {
        System.out.println("Автомобілі та їх власники:");
        for (Map.Entry<Car, List<String>> entry : carsAndOwners.entrySet()) {
            Car car = entry.getKey();
            List<String> owners = entry.getValue();
            System.out.println(car.color + ": " + String.join(", ", owners));
        }
    }
    public static List<String> getRandomOwners(List<String> availableOwners) {
        Random random = new Random();
        int numberOfOwners = random.nextInt(3) + 1;
        Set<String> selectedOwners = new HashSet<>();

        while (selectedOwners.size() < numberOfOwners) {
            int index = random.nextInt(availableOwners.size());
            selectedOwners.add(availableOwners.get(index));
        }
        return new ArrayList<>(selectedOwners);
    }
}

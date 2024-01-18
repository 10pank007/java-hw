package hw5.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW",
                5,
                new Owner("ivan", 25, 5), 5000, 2019));
        cars.add(new Car("Audi",
                7.8,
                new Owner("bohdan", 28, 7), 9000, 2020));
        cars.add(new Car("Toyota",
                2,
                new Owner("alina", 19, 1), 8000, 2021));
        cars.add(new Car("Skoda",
                5,
                new Owner("lilia", 24, 3), 7000, 2018));
        cars.add(new Car("Opel",
                4,
                new Owner("vova", 26, 6), 7000, 2015));
        cars.add(new Car("MersedezBenz",
                4.2,
                new Owner("petro", 22, 4), 1000, 2019));
        cars.add(new Car("Fiat",
                2.2,
                new Owner("viktor", 24, 3), 6000, 2021));
        cars.add(new Car("Renault",
                2.6,
                new Owner("olia", 34, 2), 19000, 2019));
        cars.add(new Car("Mazda",
                3.2,
                new Owner("diana", 18, 0), 2500, 2017));
        cars.add(new Car("Honda",
                4,
                new Owner("yana", 25, 3), 15000, 2021));
        System.out.println(cars);
        cars.stream().limit(10).forEach(car -> car.setEnginePower(car.getEnginePower() + (car.getEnginePower()*0.1)));
        System.out.println(cars);
        cars.stream().filter(car -> car.getOwner().getExperienceOfDrive() < 5 && car.getOwner().getAge() > 25)
                .forEach(car -> car.getOwner().setExperienceOfDrive(car.getOwner().getExperienceOfDrive() + 1));
        long sum = cars.stream().mapToLong(Car::getPrice).sum();
        System.out.println(sum);
        System.out.println(cars);
    }
}

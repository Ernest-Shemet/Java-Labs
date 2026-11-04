
package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Бензин", 150);
        SportsCar sportsCar = new SportsCar("Ferrari", "Бензин", 600);
        SUV suv = new SUV("Toyota Land Cruiser", "Дизель", 300);
        car.start();
        car.start(1234);

        car.start("Спорт");
        sportsCar.start();
        sportsCar.start(2.5);
        suv.start();
        suv.start(true);
        System.out.println();
        Car[] cars = {car, sportsCar, suv};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].brand + ": " + cars[i].getEfficiency());
        }
    }
}

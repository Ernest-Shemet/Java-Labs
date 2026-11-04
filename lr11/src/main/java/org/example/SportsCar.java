package org.example;

class SportsCar extends Car {
    SportsCar(String brand, String engine, int horsepower) {
        super(brand, engine, horsepower);
    }
    @Override
    String getEfficiency() {
        return "Низкая эффективность";
    }
    void start(double time) {
        System.out.println("Спорткар заводится за " + time + " секунды");
    }
}

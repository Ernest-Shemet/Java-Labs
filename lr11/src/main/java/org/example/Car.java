package org.example;
class Car {
    String brand;
    String engine;
    int horsepower;
    Car(String brand, String engine, int horsepower) {
        this.brand = brand;
        this.engine = engine;
        this.horsepower = horsepower;
    }
    void start() {
        System.out.println("Завожу");
    }
    void start(int a) {
        System.out.println("Завожу кодом " );
    }
    void start(String a) {
        System.out.println("Завожу в режиме " + a);
    }
    void start(int b, int c){}
    String getEfficiency() {
        return "Средняя эффективность";
    }
}

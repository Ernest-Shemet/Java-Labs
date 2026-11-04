package org.example;

class SUV extends Car {
    SUV(String brand, String engine, int horsepower) {
        super(brand, engine, horsepower);
    }

    @Override
    String getEfficiency() {
        return "Средняя эффективность";
    }

    void start(boolean offroad) {
        if (offroad) {
            System.out.println("Включен внедорожный режим");
        } else {
            System.out.println("Обычный режим");
        }
    }
}

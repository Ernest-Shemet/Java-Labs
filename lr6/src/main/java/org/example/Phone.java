package org.example;

class Phone {
    String brand;
    String model;
    double price;
    int count;

    int getcount() {
        return count;
    }

    public void setcount(int count1) {
        count = count1;
    }
    Phone(int count, String brand, String model, double price){
       this(brand,model,price);
        setcount( count);


    }


    Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }

    double getPrice() {
        return price;
    }

    void applyDiscount(double discount) {
        price = price - price * discount / 100;
    }
}

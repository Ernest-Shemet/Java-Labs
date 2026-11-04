package org.example;

class Software {
    default String name;
    private String version;
    private double price;

    public Software(String name, String version, double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void install() {
        System.out.println("Установка программы");
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Версия: " + version);
        System.out.println("Цена: " + price);
    }
}

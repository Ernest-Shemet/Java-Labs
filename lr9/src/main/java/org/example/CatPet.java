package org.example;

class CatPet extends Pet {
    private String color;

    public CatPet(String name, int age, String owner, String color) {
        super(name, age, owner);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void feed() {
        System.out.println("Кормится 3 раза в день");
    }

    @Override
    public String getSpecialNeeds() {
        return "Нуждается в лотке";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Цвет: " + color);
    }
}

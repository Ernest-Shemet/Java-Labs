package org.example;

class DogPet extends Pet {
    private String breed;

    public DogPet(String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void feed() {
        System.out.println("Кормится 2 раза в день");
    }

    @Override
    public String getSpecialNeeds() {
        return "Нуждается в прогулках";
    }

    public void test1(){
        System.out.println("привет мир");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Порода: " + breed);
    }
}

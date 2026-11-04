package org.example;

public class Main {
    public static void main(String[] args) {
        Pet[] pets = {
                new DogPet("Рекс", 3, "Иван", "Овчарка"),
                new DogPet("Бобик", 5, "Анна", "Лабрадор"),
                new CatPet("Мурка", 2, "Олег", "Белый"),
                new CatPet("Барсик", 4, "Мария", "Рыжий"),
                new CatPet("Симба", 1, "Алексей", "Черный")
        };
        Pet pet1 = new DogPet("Рекс", 3, "Иван", "Овчарка");
        DogPet dogPet = new DogPet("Рекс", 3, "Иван", "Овчарка");
        pet1.test();
        dogPet.test();
        pet1.test1();
        dogPet.test1();

       /* for (Pet pet : pets) {
            System.out.println("------------------------");
            pet.displayInfo();
            pet.feed();
            System.out.println(
                    "Особые потребности: " + pet.getSpecialNeeds()
            );
            System.out.println();
        }*/
    }
}
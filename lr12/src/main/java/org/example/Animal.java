package org.example;

class Animal {
    String name;
    int id;
    String habitat;

    Animal(String name, int id, String habitat) {
        this.name = name;
        this.id = id;
        this.habitat = habitat;
    }

    public String toString() {
        return "Имя: " + name + ", ID: " + id + ", Среда обитания: " + habitat;
    }
}

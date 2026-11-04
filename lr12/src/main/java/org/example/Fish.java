package org.example;

class Fish extends Animal {
    int fins;

    Fish(String name, int id, String habitat, int fins) {
        super(name, id, habitat);
        this.fins = fins;
    }

    @Override
    public String toString() {
        return super.toString() + ", Плавники: " + fins;
    }
}

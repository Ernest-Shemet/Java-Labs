package org.example;

class Mammal extends Animal {
    boolean fur;

    Mammal(String name, int id, String habitat, boolean fur) {
        super(name, id, habitat);
        this.fur = fur;
    }

    @Override
    public String toString() {
        return super.toString() + ", Шерсть: " + fur;
    }
}

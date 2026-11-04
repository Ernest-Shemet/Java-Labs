package org.example;

class Reptile extends Animal {
    boolean scales;

    Reptile(String name, int id, String habitat, boolean scales) {
        super(name, id, habitat);
        this.scales = scales;
    }

    @Override
    public String toString() {
        return super.toString() + ", Чешуя: " + scales;
    }
}

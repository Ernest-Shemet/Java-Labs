package org.example;

class MedicineNotFoundException extends Exception {
    MedicineNotFoundException(String soobshenie) {
        super(soobshenie);
    }
}

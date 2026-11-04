package org.example;

class InvalidPharmacyDataException extends Exception {
    InvalidPharmacyDataException(String soobshenie) {
        super(soobshenie);
    }
}

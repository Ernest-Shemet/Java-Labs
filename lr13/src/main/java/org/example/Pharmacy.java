
package org.example;

import java.util.HashMap;
import java.util.Map;

class Pharmacy {
    String name;
    String address;
    int medicines;
    Map<String, Integer> stock;
    double rating;

    Pharmacy(String nazvanie, String adres, int kolLekarstv, double reiting)
            throws InvalidPharmacyDataException {

        setName(nazvanie);
        setAddress(adres);
        setMedicines(kolLekarstv);
        setRating(reiting);

        stock = new HashMap<>();
    }

    public void setName(String nazvanie)
            throws InvalidPharmacyDataException {

        if (nazvanie == null || nazvanie.isEmpty()) {
            throw new InvalidPharmacyDataException(
                    "Название аптеки не может быть пустым");
        }

        name = nazvanie;
    }

    public void setAddress(String adres)
            throws InvalidPharmacyDataException {

        if (adres == null || adres.isEmpty()) {
            throw new InvalidPharmacyDataException(
                    "Адрес не может быть пустым");
        }

        address = adres;
    }

    public void setMedicines(int kolLekarstv)
            throws InvalidPharmacyDataException {

        if (kolLekarstv < 0) {
            throw new InvalidPharmacyDataException(
                    "Количество лекарств не может быть отрицательным");
        }

        medicines = kolLekarstv;
    }

    public void setRating(double reiting)
            throws InvalidPharmacyDataException {

        if (reiting < 0 || reiting > 5) {
            throw new InvalidPharmacyDataException(
                    "Рейтинг должен быть от 0 до 5");
        }

        rating = reiting;
    }

    void addMedicine(String lekarstvo, int kolichestvo)
            throws StockException {

        if (kolichestvo <= 0) {
            throw new StockException(
                    "Количество должно быть больше нуля");
        }

        if (!stock.containsKey(lekarstvo)) {
            medicines++;
        }

        stock.put(lekarstvo,
                stock.getOrDefault(lekarstvo, 0) + kolichestvo);
    }

    void sellMedicine(String lekarstvo, int kolichestvo)
            throws MedicineNotFoundException, StockException {

        if (!stock.containsKey(lekarstvo)) {
            throw new MedicineNotFoundException(
                    "Лекарство не найдено: " + lekarstvo);
        }

        if (kolichestvo <= 0 || stock.get(lekarstvo) < kolichestvo) {
            throw new StockException(
                    "Неверное количество или недостаточно запасов");
        }

        stock.put(lekarstvo, stock.get(lekarstvo) - kolichestvo);

        System.out.println("Продано: " + lekarstvo +
                ", количество: " + kolichestvo);
    }

    void restockMedicine(String lekarstvo, int kolichestvo)
            throws MedicineNotFoundException, StockException {

        if (!stock.containsKey(lekarstvo)) {
            throw new MedicineNotFoundException(
                    "Лекарство не найдено: " + lekarstvo);
        }

        if (kolichestvo <= 0) {
            throw new StockException(
                    "Количество должно быть больше нуля");
        }

        stock.put(lekarstvo, stock.get(lekarstvo) + kolichestvo);

        System.out.println("Пополнено: " + lekarstvo +
                ", количество: " + kolichestvo);
    }

    void printStock() {
        System.out.println("Аптека: " + name);
        System.out.println("Адрес: " + address);
        System.out.println("Рейтинг: " + rating);
        System.out.println("Наименований лекарств: " + medicines);

        for (Map.Entry<String, Integer> zapis : stock.entrySet()) {
            System.out.println(zapis.getKey() + ": " +
                    zapis.getValue() + " шт.");
        }
    }
}

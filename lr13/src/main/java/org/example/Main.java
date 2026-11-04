
package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Pharmacy apteka = new Pharmacy(
                    "Здоровье", "Минск", 0, 4.8);
            apteka.addMedicine("Парацетамол", 20);
            apteka.addMedicine("Ибупрофен", 15);
            apteka.addMedicine("Аспирин", -1);
            apteka.printStock();
            apteka.sellMedicine("Парацетамол", 5);
            apteka.restockMedicine("Ибупрофен", 10);
            apteka.printStock();
            apteka.sellMedicine("Аспирин", 50);
        } catch (InvalidPharmacyDataException oshibka) {
            System.err.println("Ошибка данных: " + oshibka.getMessage());
        } catch (MedicineNotFoundException oshibka) {
            System.err.println("Ошибка поиска: " + oshibka.getMessage());
        } catch (StockException oshibka) {
            System.err.println("Ошибка запасов: " + oshibka.getMessage());
        } finally {
            System.out.println("Работа программы завершена");
        }
    }
}

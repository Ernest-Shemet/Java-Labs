package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
public class Main {
    static void printMagazines(List<Magazine> magazines, int rating) {
        for (Magazine magazine : magazines) {
            if (magazine.getRating() == rating) {
                System.out.println(magazine.id + " | " +
                        magazine.title + " | Рейтинг: " + magazine.getRating());
            }
        }
    }
    public static void main(String[] args) {
        List<Magazine> magazines = new ArrayList<>();
        magazines.add(new Magazine(1, "Наука", "Научный", 3,
                Arrays.asList(5, 4, 5)));
        magazines.add(new Magazine(2, "Спорт", "Спортивный", 2,
                Arrays.asList(2, 3, 2)));
        magazines.add(new Magazine(3, "Авто", "Автомобильный", 3,
                Arrays.asList(4, 4, 4)));
        magazines.add(new Magazine(4, "Природа", "Познавательный", 2,
                Arrays.asList(1, 2, 3)));
        magazines.add(new Magazine(5, "Техника", "Технический", 4,
                Arrays.asList(5, 5, 4)));
        magazines.add(new Magazine(6, "История", "Исторический", 3,
                Arrays.asList(3, 4, 4)));
        Iterator<Magazine> iterator = magazines.iterator();
        while (iterator.hasNext()) {
            Magazine magazine = iterator.next();
            if (magazine.getAverageRating() < 3) {
                iterator.remove();
            }
        }
        for (Magazine magazine : magazines) {
            if (magazine.getAverageRating() >= 4) {
                magazine.setRating(magazine.getRating() + 1);
            }
        }
        System.out.println("Журналы с рейтингом 4:");
        printMagazines(magazines, 4);
        magazines.sort(
                Comparator.comparingDouble(Magazine::getAverageRating)
                        .reversed()
                        .thenComparing(m -> m.title)
        );
        System.out.println("\nВсе журналы после сортировки:");
        for (Magazine magazine : magazines) {
            System.out.printf("ID: %d | Название: %s | Средний рейтинг: %.2f%n",
                    magazine.id,
                    magazine.title,
                    magazine.getAverageRating());
        }
    }
}

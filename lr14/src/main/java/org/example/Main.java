
package org.example;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner vvod = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Любимый транспорт");
            System.out.println("2. Числа кратные 6, но не 9");
            System.out.println("3. Разделение случайных чисел");
            System.out.println("4. Средний заряд батареи");
            System.out.println("5. Числа меньше 40");
            System.out.println("0. Выход");
            System.out.print("Выберите задание: ");

            int vybor = vvod.nextInt();

            switch (vybor) {
                case 1:
                    zadanie1();
                    break;
                case 2:
                    zadanie2();
                    break;
                case 3:
                    zadanie3();
                    break;
                case 4:
                    zadanie4();
                    break;
                case 5:
                    zadanie5();
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    return;
                default:
                    System.out.println("Такого задания нет");
            }
        }
    }
    static void zadanie1() {
        try (PrintWriter zapis = new PrintWriter("transport.txt")) {
            zapis.println("Мой любимый транспорт - поезд.");
            zapis.println("Поезд перевозит пассажиров.");
            zapis.println("Мне нравится путешествовать на поезде.");
        } catch (IOException oshibka) {
            oshibka.printStackTrace();
            return;
        }
        File fail = new File("transport.txt");
        System.out.println("Название файла: " + fail.getName());
        System.out.println("Размер файла: " + fail.length());
        System.out.println("Путь к файлу: " + fail.getAbsolutePath());
        try (Scanner chtenie = new Scanner(fail)) {
            while (chtenie.hasNextLine()) {
                System.out.println(chtenie.nextLine());
            }
        } catch (FileNotFoundException oshibka) {
            oshibka.printStackTrace();
        }
    }
    static void zadanie2() {
        System.out.println("Введите 10 целых чисел:");
        try (PrintWriter zapis = new PrintWriter("f2.txt")) {
            for (int i = 0; i < 10; i++) {
                int chislo = vvod.nextInt();
                zapis.println(chislo);
            }
        } catch (IOException oshibka) {
            oshibka.printStackTrace();
            return;
        }
        int kolichestvo = 0;
        try (Scanner chtenie = new Scanner(new File("f2.txt"))) {
            while (chtenie.hasNextInt()) {
                int chislo = chtenie.nextInt();
                System.out.println(chislo);
                if (chislo % 6 == 0 && chislo % 9 != 0) {
                    kolichestvo++;
                }
            }
        } catch (FileNotFoundException oshibka) {
            oshibka.printStackTrace();
            return;
        }
        System.out.println("Подходящих чисел: " + kolichestvo);
    }
    static void zadanie3() {
        Random sluchainoe = new Random();
        try (PrintWriter zapis = new PrintWriter("f3.txt")) {
            for (int i = 0; i < 20; i++) {
                int chislo = sluchainoe.nextInt(100) + 1;
                zapis.println(chislo);
            }
        } catch (IOException oshibka) {
            oshibka.printStackTrace();
            return;
        }
        try (
                Scanner chtenie = new Scanner(new File("f3.txt"));
                PrintWriter zapisG = new PrintWriter("g.txt");
                PrintWriter zapisH = new PrintWriter("h.txt")
        ) {
            while (chtenie.hasNextInt()) {
                int chislo = chtenie.nextInt();
                if (chislo % 8 == 0 && chislo % 3 != 0) {
                    zapisG.println(chislo);
                } else {
                    zapisH.println(chislo);
                }
            }
            System.out.println("Числа записаны в файлы g.txt и h.txt");
        } catch (IOException oshibka) {
            oshibka.printStackTrace();
        }
    }
    static void zadanie4() {
        System.out.println("Введите 10 значений заряда батареи:");
        try (PrintWriter zapis = new PrintWriter("battery.txt")) {
            for (int i = 0; i < 10; i++) {
                double zaryad = vvod.nextDouble();
                zapis.println(zaryad);
            }
        } catch (IOException oshibka) {
            oshibka.printStackTrace();
            return;
        }
        double summa = 0;
        int kolichestvo = 0;
        try (Scanner chtenie = new Scanner(new File("battery.txt"))) {
            while (chtenie.hasNextDouble()) {
                double zaryad = chtenie.nextDouble();
                summa += zaryad;
                kolichestvo++;
            }
        } catch (FileNotFoundException oshibka) {
            oshibka.printStackTrace();
            return;
        }
        if (kolichestvo > 0) {
            double srednee = summa / kolichestvo;
            System.out.println("Средний заряд: " + srednee + "%");
        }
    }
    static void zadanie5() {
        int[] chisla = {10, 45, 20, 60, 35, 80, 5, 40, 25, 90};
        try (PrintWriter zapis = new PrintWriter("f5.txt")) {
            for (int chislo : chisla) {
                zapis.println(chislo);
            }
        } catch (IOException oshibka) {
            oshibka.printStackTrace();
            return;
        }
        int kolichestvo = 0;
        try (Scanner chtenie = new Scanner(new File("f5.txt"))) {
            while (chtenie.hasNextInt()) {
                int chislo = chtenie.nextInt();
                if (chislo < 40) {
                    kolichestvo++;
                }
            }
        } catch (FileNotFoundException oshibka) {
            oshibka.printStackTrace();
            return;
        }
        System.out.println("Чисел меньше 40: " + kolichestvo);
    }
}

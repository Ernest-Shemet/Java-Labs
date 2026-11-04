import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        System.out.println("задание 2");
        System.out.println("задание 3");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                System.out.println("введите расстояние в метрах");
                double d = scanner.nextDouble();
                System.out.println("введите время в секундах");
                double t = scanner.nextDouble();
                double speedMS = d / t;
                double speedKMH = speedMS * 3.6;
                System.out.println("скорость в m/s" + speedMS);
                System.out.print("скорость в km/h" + speedKMH);
                break;

            case 2:
                System.out.println("введите число кратное 2 и 5");
                int chislo = scanner.nextInt();
                if (chislo % 2 == 0 && chislo % 5 == 0)
                    System.out.println("число кратное 2 и 5");
                else
                    System.out.println("число не кратное 2 и 5");

                break;


            case 3:
                System.out.println("введите число фибоначи");
                int fibonachi = scanner.nextInt();
                int a = 1;
                int b = 1;
                int i = 0;

                while (fibonachi > i) {
                    System.out.print(a + " ");
                    int next = a + b;
                    a = b;
                    b = next;
                    i++;
                }

        }

             scanner.close();
    }
}
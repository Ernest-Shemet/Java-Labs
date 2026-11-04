import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employee {
    String fullname;
    double salary;

    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("%-15s %10.2f%n", employee.fullname, employee.salary);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("задание 1");
        System.out.println("задание 2");
        System.out.println("задание 3");
        System.out.println("задание 4");

        int choise = scanner.nextInt();

        switch (choise) {

            case 1:
                System.out.println("введите любое число");
                int num1 = scanner.nextInt();

                String text = String.valueOf(num1);

                System.out.println(text);
                break;

            case 2:
                scanner.nextLine();

                System.out.println("введите любое предложение на русском");
                String text2 = scanner.nextLine();

                text2 = text2.replaceAll("[аяуоэеёиыюАЯУОЭЕЁИЫЮ]", "");

                System.out.println(text2);
                break;

            case 3:
                String text3 = "a!a a@a a#a a$a a%a a^a";

                Pattern pattern = Pattern.compile("a[^a-zA-Z ]a");
                Matcher matcher = pattern.matcher(text3);

                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
                break;

            case 4:
                Employee[] employees = {
                        new Employee("Иванов", 2500.50),
                        new Employee("Петров", 3150.75),
                        new Employee("Сидоров", 4270.00),
                        new Employee("Козлов", 2899.90)
                };

                Report.generateReport(employees);
                break;
        }
    }
}
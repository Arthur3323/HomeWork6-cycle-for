public class Main {
    public static void main(String[] args) {


        // Задача 1
        System.out.println("Task 1:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Задача 2
        System.out.println("\nTask 2:");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // Задача 3
        System.out.println("\nTask 3:");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        // Задача 4
        System.out.println("\nTask 4:");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // Задача 5
        System.out.println("\nTask 5:");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }

        // Задача 6
        System.out.println("\nTask 6:");
        for (int i = 7; i <= 100; i += 7) {
            System.out.println(i);
        }

        // Задача 7
        System.out.println("\nTask 7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        // Задача 8
        System.out.println("\nTask 8:");
        int savings = 29000;
        int savingsEveryMonth;
        for (int i = 1; i <= 12; i++) {

            savingsEveryMonth = savings * i;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsEveryMonth + " рублей");
        }

        // Задача 9
        System.out.println("\nTask 9:");
        for (int i = 1; i <= 12; i++) {
            savings = savings + savings / 100;
            savingsEveryMonth = savings * i;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsEveryMonth + " рублей");
        }
        // Задача 10
        System.out.println("\nTask 10:");
        int firstNumber = 2;
        int result;
        for (int i = 1; i <= 10; i++) {
            result = firstNumber * i;
            System.out.println(firstNumber + "*" + i + "=" + result);
        }

    }
}
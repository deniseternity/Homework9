import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] salaryArray = generateRandomArray();
        int salarySum = 0;

        System.out.println(Arrays.toString(salaryArray));

        for (int salary : salaryArray) {
            salarySum += salary;
        }

        System.out.println("Сумма трат за месяц составила " + salarySum + "рублей.");
    }

    private static void task2() {
        System.out.println("Задача 2");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int minExpenses = salaryArray[0];
        int maxExpenses = salaryArray[0];

        for (int salary : salaryArray) {
            if (salary < minExpenses) {
                minExpenses = salary;
            }

            if (salary > maxExpenses) {
                maxExpenses = salary;
            }
        }

        System.out.println("Минимальная сумма трат за день составила" + minExpenses +
                "рублей. Максимальная сумма трат за день составила" + maxExpenses + "Рублей.");
    }

    private static void task3() {
        System.out.println("Задача 3");

        int[] salaryArray = generateRandomArray();
        int salarySum = 0;

        System.out.println(Arrays.toString(salaryArray));

        for (int salary : salaryArray) {
            salarySum += salary;
        }

        double salaryAverage = (double) salarySum / salaryArray.length;

        System.out.println("Средняя сумма трат за день составила " + salaryAverage + "Рублей.");
    }

    private static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'i'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    }
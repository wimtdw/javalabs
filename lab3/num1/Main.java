package lab3.num1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int len = 10;

        double[] arr1 = new double[len];
        for (int i = 0; i < len; i++) {
            arr1[i] = Math.random();
        }
        System.out.println("Массив с использованием Math.random():");
        printArray(arr1);

        Arrays.sort(arr1);

        System.out.println("\nОтсортированный массив с использованием Math.random():");
        printArray(arr1);

        double[] arr2 = new double[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            arr2[i] = random.nextDouble();
        }

        System.out.println("\nМассив с использованием класса Random:");
        printArray(arr2);

        Arrays.sort(arr2);

        System.out.println("\nОтсортированный массив с использованием класса Random:");
        printArray(arr2);
    }

    private static void printArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

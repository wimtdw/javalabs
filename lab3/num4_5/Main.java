package lab3.num4_5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите корректное число: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);
        int[] randomArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            randomArray[i] = random.nextInt(n + 1);
        }
        System.out.println("Первый массив:");
        printArray(randomArray);
        int evenCount = 0;
        for (int num : randomArray) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        int[] evenArray = new int[evenCount];
        int index = 0;
        for (int num : randomArray) {
            if (num % 2 == 0) {
                evenArray[index++] = num;
            }
        }
        if (evenCount != 0){
            System.out.println("\nВторой массив: ");
            printArray(evenArray);
        }
        else
            System.out.println("В первом массиве нет четных элементов");
    }
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


package lab8.num5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + sum);
    }

    public static int sumOfDigits(int N) {
        if (N == 0) {
            return 0;
        } else {
            int lastDigit = N % 10;
            int remainingDigits = N / 10;
            return lastDigit + sumOfDigits(remainingDigits);
        }
    }
}


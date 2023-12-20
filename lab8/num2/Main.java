package lab8.num2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumbers(n, 1);
    }

    public static void printNumbers(int n, int current) {
        if (current <= n) {
            System.out.println(current);
            printNumbers(n, current + 1);
        }
    }
}


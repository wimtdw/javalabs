package lab8.num3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A < B) {
            printAscending(A, B);
        } else {
            printDescending(A, B);
        }
    }

    public static void printAscending(int A, int B) {
        if (A <= B) {
            System.out.println(A);
            printAscending(A + 1, B);
        }
    }

    public static void printDescending(int A, int B) {
        if (A >= B) {
            System.out.println(A);
            printDescending(A - 1, B);
        }
    }
}


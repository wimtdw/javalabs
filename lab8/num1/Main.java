package lab8.num1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printTriangleSequence(n, 1);
    }

    public static void printTriangleSequence(int n, int k) {
        if (n <= 0) {
            return;
        }

        for (int i = 0; i < k; i++) {
            System.out.print(k + " ");
        }


        printTriangleSequence(n - k, k + 1);
    }
}


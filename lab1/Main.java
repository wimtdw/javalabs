package lab1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void pr_1_3() {
        int[] m = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 5 чисел");
        int summa = 0;
        for (int i = 0; i < 5; i++) {
            m[i] = sc.nextInt();
            summa += m[i];
        }
        double sr = (double) summa / m.length;
        System.out.println("Сумма: " + summa + ", Среднее: " + sr);
    }

    public static void pr_1_4() {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        int i = 0;
        int summa = 0;
        int max_num = Integer.MIN_VALUE;
        int min_num = Integer.MAX_VALUE;
        System.out.println("Введите 5 чисел");
        while (i < 5) {
            n[i] = sc.nextInt();
            if (n[i] > max_num) {
                max_num = n[i];
            }
            if (n[i] < min_num) {
                min_num = n[i];
            }
            summa += n[i];
            i++;
        }
        System.out.println("Сумма: " + summa + "\nМинимальный элемент: " + min_num + ", " +
                "Максимальный элемент: " + max_num);
        sc.nextLine();
        int[] p = new int[5];
        i = 0;
        summa = 0;
        max_num = Integer.MIN_VALUE;
        min_num = Integer.MAX_VALUE;
        System.out.println("Введите 5 чисел");
        do {
            p[i] = sc.nextInt();
            if (p[i] > max_num) {
                max_num = p[i];
            }
            if (p[i] < min_num) {
                min_num = p[i];
            }
            summa += p[i];
            i++;
        } while (i < 5);
        System.out.println("Сумма: " + summa + "\nМинимальный элемент: " + min_num +
                ", Максимальный элемент: " + max_num);
    }


    public static void pr_1_6() {
        System.out.println("Первые 10 чисел гармонического ряда: ");
        for (int j = 1; j <= 10; j++) {
            if (j != 1)
                System.out.println(1 + "/" + j);
            else
                System.out.println(1);
        }
    }

    public static void pr_1_7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число больше 0");
        int f = sc.nextInt();
        System.out.println("Факториал = " + fact(f));
    }

    public static void main(String[] args) {
        Scanner m_sc = new Scanner(System.in);
        int num = 5;
        while (num != 0) {
            System.out.print("Номер задачи: ");
            num = m_sc.nextInt();
            switch (num) {
                case 0:
                    break;
                case 3:
                    pr_1_3();
                    break;
                case 4:
                    pr_1_4();
                    break;
                case 5:
                    System.out.println("Аргументы командной строки: ");
                    for (int j = 0; j < args.length; j++) {
                        System.out.println(args[j]);
                    }
                    break;
                case 6:
                    pr_1_6();
                    break;
                case 7:
                    pr_1_7();
                    break;
                default:
                    System.out.println("неправильный номер");
                    break;
            }
        }
    }

    public static BigInteger fact(int fact) {
        BigInteger ans = new BigInteger("1");
        for (int i = 1; i <= fact; i++)
            ans = ans.multiply(BigInteger.valueOf(i));
        return ans;
    }
}




package lab2.num10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        String[] words = str.split(" +");
        int wordCount = words.length;
        System.out.println("Вы ввели " + wordCount + " слов");
    }
}


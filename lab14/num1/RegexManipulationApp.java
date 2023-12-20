package lab14.num1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexManipulationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку (или 'exit' для выхода): ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                break;
            }
            System.out.println("Выберите действие:");
            System.out.println("1. Поиск по регулярному выражению");
            System.out.println("2. Замена по регулярному выражению");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите регулярное выражение для поиска: ");
                    String regex = scanner.nextLine();
                    searchWithRegex(input, regex);
                    break;
                case 2:
                    System.out.println("Введите регулярное выражение для замены: ");
                    String replaceRegex = scanner.nextLine();
                    System.out.println("Введите замену: ");
                    String replacement = scanner.nextLine();
                    replaceWithRegex(input, replaceRegex, replacement);
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
                    break;
            }
        }
    }

    public static void searchWithRegex(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Найдено совпадение: " + matcher.group());
        }
    }

    public static void replaceWithRegex(String input, String regex, String replacement) {
        String result = input.replaceAll(regex, replacement);
        System.out.println("Результат замены: " + result);
    }
}

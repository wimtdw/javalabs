package lab13.num1;

public class Main {
    public static void main(String[] args) {
        // 1. Передаем строку в метод
        String inputString = "I like Java!!!";

        // 2. Распечатываем последний символ строки
        char lastChar = inputString.charAt(inputString.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // 3. Проверяем, заканчивается ли строка подстрокой "!!!"
        boolean endsWithExclamation = inputString.endsWith("!!!");
        System.out.println("Строка заканчивается на '!!!': " + endsWithExclamation);

        // 4. Проверяем, начинается ли строка подстрокой "I like"
        boolean startsWithILike = inputString.startsWith("I like");
        System.out.println("Строка начинается с 'I like': " + startsWithILike);

        // 5. Проверяем, содержит ли строка подстроку "Java"
        boolean containsJava = inputString.contains("Java");
        System.out.println("Строка содержит 'Java': " + containsJava);

        // 6. Находим позицию подстроки "Java" в строке
        int javaPosition = inputString.indexOf("Java");
        System.out.println("Позиция 'Java' в строке: " + javaPosition);

        // 7. Заменяем все символы 'а' на 'о'
        String replacedString = inputString.replace('a', 'o');
        System.out.println("Строка после замены 'a' на 'o': " + replacedString);

        // 8. Преобразуем строку к верхнему регистру
        String uppercaseString = inputString.toUpperCase();
        System.out.println("Строка в верхнем регистру: " + uppercaseString);

        // 9. Преобразуем строку к нижнему регистру
        String lowercaseString = inputString.toLowerCase();
        System.out.println("Строка в нижнем регистру: " + lowercaseString);

        // 10. Вырезаем подстроку "Java" из строки
        String substring = inputString.substring(7, 11);
        System.out.println("Вырезанная подстрока: " + substring);
    }
}


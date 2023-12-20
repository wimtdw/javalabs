package lab14.num4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitChecker {
    public static void main(String[] args) {
        String text = "(1+8)–9+4,6/5–2*9";
        String regex = "\\d(?![+])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        while (matcher.find()) {
            String digit = matcher.group();
            System.out.println("Найдена цифра без знака '+': " + digit);
            found = true;
        }

        if (!found) {
            System.out.println("В тексте нет цифр без знака '+'");
        }
    }
}


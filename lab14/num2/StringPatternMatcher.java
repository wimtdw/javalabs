package lab14.num2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringPatternMatcher {
    public static void main(String[] args) {
        String patternString = "abcdefghijklmnopqrstuv18340";
        String[] testStrings = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340"
        };

        Pattern pattern = Pattern.compile("^" + patternString + "$");

        for (String testString : testStrings) {
            Matcher matcher = pattern.matcher(testString);

            if (matcher.matches()) {
                System.out.println(testString + " - Правильное выражение");
            } else {
                System.out.println(testString + " - Неправильное выражение");
            }
        }
    }
}


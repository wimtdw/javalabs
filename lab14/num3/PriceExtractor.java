package lab14.num3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceExtractor {
    public static void main(String[] args) {
        String text = "Цены: 125.78 USD, 125 RUB, 10.0 EU, 32 ERR, 0.102 UE.";
        String usdRegex = "(\\d+\\.\\d+) USD";
        String rubRegex = "(\\d+) RUB";
        String euRegex = "(\\d+\\.\\d+) EU";

        Pattern usdPattern = Pattern.compile(usdRegex);
        Pattern rubPattern = Pattern.compile(rubRegex);
        Pattern euPattern = Pattern.compile(euRegex);

        Matcher usdMatcher = usdPattern.matcher(text);
        Matcher rubMatcher = rubPattern.matcher(text);
        Matcher euMatcher = euPattern.matcher(text);

        while (usdMatcher.find()) {
            String usdPrice = usdMatcher.group(1);
            System.out.println("Найдена цена в USD: " + usdPrice);
        }

        while (rubMatcher.find()) {
            String rubPrice = rubMatcher.group(1);
            System.out.println("Найдена цена в RUB: " + rubPrice);
        }

        while (euMatcher.find()) {
            String euPrice = euMatcher.group(1);
            System.out.println("Найдена цена в EU: " + euPrice);
        }
    }
}


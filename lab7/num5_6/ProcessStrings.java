package lab7.num5_6;


public class ProcessStrings implements StringUtil {
    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String oddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i+=2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        ProcessStrings stringUtils = new ProcessStrings();

        // Тестирование countCharacters
        String testString = "Hello, World!";
        int characterCount = stringUtils.countCharacters(testString);
        System.out.println("Character count: " + characterCount);

        // Тестирование oddPositionCharacters
        String oddCharacters = stringUtils.oddPositionCharacters(testString);
        System.out.println("Odd position characters: " + oddCharacters);

        // Тестирование reverseString
        String reversedString = stringUtils.reverseString(testString);
        System.out.println("Reversed string: " + reversedString);
    }
}

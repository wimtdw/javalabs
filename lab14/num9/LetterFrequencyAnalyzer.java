package lab14.num9;

public class LetterFrequencyAnalyzer {
    public static void main(String[] args) {
        String text = "This is a sample text to analyze letter frequencies. " +
                "Some sample text. Do you like java?";

        text = text.toLowerCase();

        int[] letterFrequency = new int[26];

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                letterFrequency[index]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);
            System.out.println(letter + ": " + letterFrequency[i]);
        }
    }
}


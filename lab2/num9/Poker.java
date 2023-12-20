package lab2.num9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество игроков: ");
        int num = scanner.nextInt();

        ArrayList<String> deck = new ArrayList<>();
        String[] suits = {"Пики", "Крести", "Черви", "Бубны"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }
        Collections.shuffle(deck);

        for (int i = 0; i < num; i++) {
            if (deck.isEmpty()){
                break;
            }
            for (int j = 0; j < 5; j++) {
                if (deck.isEmpty()){
                    System.out.println("Карты закончились");
                    break;
                }
                else{
                    String card = deck.remove(0);
                    System.out.println(card);
                }
            }
            System.out.println();
        }

    }
}


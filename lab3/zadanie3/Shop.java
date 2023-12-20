package lab3.zadanie3;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество товара: ");
        int quantity = scanner.nextInt();
        System.out.print("Введите цену товара в рублях: ");
        double price = scanner.nextDouble();
        System.out.print("Выберите валюту для оплаты (EUR, RUB): ");
        scanner.nextLine();
        String currency = scanner.nextLine().toUpperCase();
        double totalCost = calculateTotalCost(price, quantity, currency);
        if (totalCost != 0)
            System.out.println("Итого: " + totalCost + " " + currency);
        else
            System.out.println("Ошибка");
    }
    public static double calculateTotalCost(double price, int quantity, String currency) {
        double totalCost;
        if (currency.equals("RUB")){
            totalCost = price * quantity;
        }
        else if (currency.equals("EUR")){
            Converter converter = new Converter(103.09);
            totalCost = quantity * converter.convertRUBtoEUR(price);
        }
        else{
            System.out.println("Неизвестная валюта");
            totalCost = 0;
        }
        return totalCost;
    }
}

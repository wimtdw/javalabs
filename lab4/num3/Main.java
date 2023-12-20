package lab4.num3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        // Добавление товаров
        store.addProduct("P1", "Ноутбук", 1000.0, Category.ELECTRONICS);
        store.addProduct("P2", "Футболка", 20.0, Category.CLOTHING);
        store.addProduct("P3", "Книга", 15.0, Category.BOOKS);

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter username: ");
        String name = scanner.nextLine();
        System.out.print("enter password: ");
        String password = scanner.nextLine();

        // Регистрация пользователей
        store.registerUser(name, password);
        store.registerUser("user2", "password2");

        // Вход пользователя
        if (store.login(name, password)) {
            User currentUser = store.getCurrentUser();

            // Просмотр категорий и товаров
            store.viewCategories();
            store.viewProductsByCategory(Category.CLOTHING);

            // Добавление товаров в корзину
            store.addToCart("P2");
            store.addToCart("P3");

            // Оформление заказа
            store.checkout();
        } else {
            System.out.println("Ошибка входа. Пользователь не найден.");
        }

        // Выход пользователя
        store.logout();
    }
}

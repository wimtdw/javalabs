package lab4.num3;


import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Store {
    private Map<String, Product> products; // Карта товаров с уникальными идентификаторами
    private Map<String, User> users;       // Карта пользователей магазина
    private User currentUser;              // Текущий пользователь

    public Store() {
        this.products = new HashMap<>();
        this.users = new HashMap<>();
    }

    public void addProduct(String productId, String productName, double price, Category category) {
        Product product = new Product(productId, productName, price, category);
        products.put(productId, product);
    }

    public void registerUser(String username, String password) {
        User user = new User(username, password);
        users.put(username, user);
    }

    public boolean login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            currentUser = user;
            return true;
        }
        return false;
    }

    public void logout() {
        currentUser = null;
    }

    public void viewCategories() {
        System.out.println("Список категорий товаров:");
        for (Category category : Category.values()) {
            System.out.println(category.name());
        }
    }

    public void viewProductsByCategory(Category category) {
        System.out.println("Список товаров категории " + category.name() + ":");
        for (Product product : products.values()) {
            if (product.getCategory() == category) {
                System.out.println(product);
            }
        }
    }

    public void addToCart(String productId) {
        if (currentUser != null) {
            Product product = products.get(productId);
            if (product != null) {
                currentUser.addToCart(product);
                System.out.println("Товар "+product +" добавлен в корзину.");
            } else {
                System.out.println("Товар с ID " + productId + " не найден.");
            }
        } else {
            System.out.println("Пожалуйста, войдите в систему.");
        }
    }

    public void checkout() {
        if (currentUser != null) {
            List<Product> cart = currentUser.getCart();
            if (cart.isEmpty()) {
                System.out.println("Корзина пуста. Оформление заказа невозможно.");
            } else {
                double totalCost = 0;
                System.out.println("Содержимое корзины:");
                for (Product product : cart) {
                    System.out.println(product);
                    totalCost += product.getPrice();
                }
                System.out.println("Общая стоимость: $" + totalCost);
                currentUser.clearCart();
                System.out.println("Заказ оформлен.");
            }
        } else {
            System.out.println("Пожалуйста, войдите в систему.");
        }
    }

    public User getCurrentUser() {
        return currentUser;
    }
}

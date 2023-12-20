package lab4.num3;

import java.util.ArrayList;
import java.util.List;
public class User {
    private String username;
    private String password;
    private List<Product> cart;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.cart = new ArrayList<>();
    }


    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public void clearCart() {
        cart.clear();
    }

    public List<Product> getCart() {
        return cart;
    }
}

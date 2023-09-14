/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_lb_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa20-bse-036
 */
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private final List<Product> items = new ArrayList<>();

    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        items.add(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }
}

public class creater {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Product A", 10.0);
        cart.addProduct("Product B", 5.0);

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }
}

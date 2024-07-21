package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cart = new HashMap<>();

    public void add(Product product, int quantity) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cart.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cart.get(product));
        }
    }

    public void minus(Product product, int quantity) {
        int existingQuantity = cart.getOrDefault(product, 0);
        int newQuantity = existingQuantity - quantity;
        if (newQuantity <= 0) {
            cart.remove(product);
        } else {
            cart.put(product, newQuantity);
        }
    }
}


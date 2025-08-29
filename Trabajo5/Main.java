package Trabajo3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("1234", "Raid", 1200.00);
        Product product2 = new Product("1237", "Fly", 1200.00);
        Product product3 = new Product("1235", "Mr.Musculo", 1202.00);
        Product product4 = new Product("1236", "Afeitadora Gillette", 1203.00);
        Product product5 = new Product("1234", "Raid", 1200.00);

        Set<Product> products = new HashSet<>();

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        System.out.println(products);
    }
}

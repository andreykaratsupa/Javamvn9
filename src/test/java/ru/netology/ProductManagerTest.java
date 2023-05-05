package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    Product product1 = new Product(1, "Product1", 100);
    Product product2 = new Product(2, "Product 2", 200);
    Product product3 = new Product(3, "Product 3", 300);

    @Test
    public void shouldSum() {
        ShopRepository repo = new ShopRepository();
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.removeById(product2.getId());

        Product[] expected = {product1, product3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
}
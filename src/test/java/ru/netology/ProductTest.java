package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    ShopRepository repo = new ShopRepository();

    Product product1 = new Product(1, "Product1", 100);
    Product product2 = new Product(2, "Product 2", 200);

    @Test
    public void shouldExceptionRemoveById() {

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(7);
        });
    }
}
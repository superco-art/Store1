package org.factoriaf5.store1.Controllers;

import org.factoriaf5.store1.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ProductController {

    private List<Product> products;

    public ProductController() {

        products = List.of(
                new Product(20, "Lotion SPF"),
                new Product(15, "Lotion After Sun")
        );
    }

    @GetMapping("/products")
    public List<Product> check() {
        public List<Product> allProducts () {
            return products;
        }
    }
}
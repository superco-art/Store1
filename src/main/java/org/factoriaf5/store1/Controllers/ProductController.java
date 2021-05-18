package org.factoriaf5.store1.Controllers;

import org.factoriaf5.store1.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ProductController {

    private List<Product> products;

    public ProductController() {
        products = new ArrayList<>();
    }



    @GetMapping("/products")
        public List<Product> allProducts () {
            return products;
        }

        @PostMapping("/products")
        public void addProducts(Product product) {
        products.add(product);
        }
    }

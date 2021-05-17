package org.factoriaf5.store1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {


    @GetMapping("/health")
    public String check() {
        return "Hello! I'm a server.";
    }
}
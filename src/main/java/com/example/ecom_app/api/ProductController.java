package com.example.ecom_app.api;

import com.example.ecom_app.model.Product;
import com.example.ecom_app.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable long id) {
        return service.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id) {
        service.deleteProduct(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }
}


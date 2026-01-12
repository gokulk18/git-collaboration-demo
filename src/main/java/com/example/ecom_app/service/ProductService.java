package com.example.ecom_app.service;

import com.example.ecom_app.model.Product;
import com.example.ecom_app.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product saveProduct(Product product) {
        return repository.saveProduct(product);
    }

    public List<Product> getProducts() {
        return repository.getProducts();
    }

    public Product getProductById(long id) {
        return repository.getProductById(id);
    }

    public void deleteProduct(long id) {
        repository.deleteProduct(id);
    }
}

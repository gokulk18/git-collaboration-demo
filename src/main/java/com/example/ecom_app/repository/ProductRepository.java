package com.example.ecom_app.repository;

import com.example.ecom_app.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    public Product saveProduct(Product product){
        products.add(product);
        return product;
    }

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(long id){
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product deleteProduct(long id){
        Product product = getProductById(id);
        if (product != null) {
            products.remove(product);
        }
        return product;
    }
}

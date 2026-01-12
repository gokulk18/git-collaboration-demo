package com.example.ecom_app.config;


import com.example.ecom_app.repository.ProductRepository;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
ProductRepository getProductRepository(){
    return new ProductRepository();
}

}

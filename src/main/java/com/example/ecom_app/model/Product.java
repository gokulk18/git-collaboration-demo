package com.example.ecom_app.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Product {
    private long id;
    private String name;
    private double price;
}

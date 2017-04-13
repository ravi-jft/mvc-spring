package com.packt.webstore.service;

import com.packt.webstore.domain.Product;

import java.util.List;
import java.util.Map;

/**
 * Created by bipul on 11/4/17.
 */
public interface ProductService {
    void updateAllStock();

    List<Product> getProductsByCategory(String category);
    List<Product> getAllProducts();
    List<Product> getProductsByFilter(Map<String,List<String>> filterParams);
    Product getProductById(String productId);
    void addProduct(Product product);
}

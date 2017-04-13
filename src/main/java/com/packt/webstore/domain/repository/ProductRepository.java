package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Product;

import java.util.List;
import java.util.Map;

/**
 * Created by bipul on 10/4/17.
 */

public interface ProductRepository {

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    void updateStock(String productId,long noOfUnits);

    List<Product> getProductsByFilter(Map<String,List<String>> filterParams);

    Product getProductById(String productID);

    void addProduct(Product product);
}

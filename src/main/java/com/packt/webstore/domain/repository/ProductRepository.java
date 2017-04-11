package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Product;

import java.util.List;

/**
 * Created by bipul on 10/4/17.
 */

public interface ProductRepository {
    List<Product> getAllProducts();

    void updateStock(String productId,long noOfUnits);
}

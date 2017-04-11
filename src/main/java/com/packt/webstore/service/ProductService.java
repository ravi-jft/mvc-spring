package com.packt.webstore.service;

import com.packt.webstore.domain.Product;

import java.util.List;

/**
 * Created by bipul on 11/4/17.
 */
public interface ProductService {
    void updateAllStock();

    List<Product> getAllProducts();
}

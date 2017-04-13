//package com.packt.webstore.service.impl;
//
//import com.packt.webstore.service.ProductService;
//
///**
// * Created by bipul on 11/4/17.
// */
//public class ProductServiceImpl implements ProductService {
//
//}

package com.packt.webstore.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void updateAllStock() {
        List<Product> allProducts = productRepository.getAllProducts();
        for(Product product : allProducts) {
            if(product.getUnitsInStock()<1001)
                productRepository.updateStock(product.getProductId(), product.getUnitsInStock()+1000);
        }
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.getAllProducts();
        return products;
    }

    public List<Product> getProductsByCategory(String category){
        return productRepository.getProductsByCategory(category);
    }

    public List<Product> getProductsByFilter(Map<String,List<String>> filterParams){
        return productRepository.getProductsByFilter(filterParams);
    }

    public Product getProductById(String productId){
        return productRepository.getProductById(productId);
    }

    public void addProduct(Product product){
        productRepository.addProduct(product);
    }
}



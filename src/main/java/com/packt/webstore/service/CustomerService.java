package com.packt.webstore.service;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.Product;

import java.util.List;

/**
 * Created by bipul on 11/4/17.
 */
public interface CustomerService {
    List<Customer> getAllCustomers();
}

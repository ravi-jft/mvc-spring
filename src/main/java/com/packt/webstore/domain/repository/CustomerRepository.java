package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Customer;

import java.util.List;

/**
 * Created by bipul on 11/4/17.
 */
public interface CustomerRepository {
    List<Customer> getAllCustomers();
}

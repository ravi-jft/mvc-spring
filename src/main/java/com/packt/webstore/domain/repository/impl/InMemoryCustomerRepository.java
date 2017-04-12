package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bipul on 11/4/17.
 */

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAllCustomers() {
        Map<String, Object> params = new HashMap<String, Object>();
        List<Customer> customer = jdbcTemplate.query("SELECT * FROM customer", params, new InMemoryCustomerRepository.CustomerMapper());
        return customer;
    }

    private static final class CustomerMapper implements RowMapper<Customer> {
        public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
            Customer customer = new Customer();
            customer.setCustomerId(rs.getString("ID"));
            customer.setName(rs.getString("NAME"));
            customer.setAddress(rs.getString("ADDRESS"));
            customer.setNoOfOrdersMade(rs.getLong("NO_OF_ORDERS_MADE"));
            return customer;
        }
    }
}

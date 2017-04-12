package com.packt.webstore.controller;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.service.CustomerService;
import com.packt.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bipul on 11/4/17.
 */

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customer")
    public String list(Model model) {
//        Customer customer = new Customer();
//        customer.setName("Demo");
//        customer.setAddress("India");
//        customer.setNoOfOrdersMade(23);
//        customer.setCustomerId("43221");
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customers";
    }
      /* @RequestMapping("/customer")
    public String customer() {
        return "customers";
    }*/

//    @Autowired
//    private CustomerService customerService;

}

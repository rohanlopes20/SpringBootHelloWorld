package com.tutorials.java;

import com.tutorials.java.model.Customer;

import java.util.List;

public interface ICustomer {
    List<Customer> getAllCustomers();
    Customer getCustomerById(String id);
}

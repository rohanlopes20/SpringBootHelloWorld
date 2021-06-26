package com.tutorials.java.service;

import com.tutorials.java.ICustomer;
import com.tutorials.java.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerService implements ICustomer {

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> listOfCustomers = new ArrayList();
        Customer rohan = new Customer(1, "Rohan", "Lopes", "abc@abc.com");
        Customer nikhil = new Customer(2, "Nikhil", "Lopes", "xyz@abc.com");
        listOfCustomers.add(rohan);
        listOfCustomers.add(nikhil);
        return listOfCustomers;
    }

    @Override
    public Customer getCustomerById(String id) {
        Customer rohan = new Customer(1, "Rohan", "Lopes", "abc@abc.com");
        return rohan;
    }
}

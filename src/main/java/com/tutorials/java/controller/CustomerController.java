package com.tutorials.java.controller;

import java.util.List;

import com.tutorials.java.ICustomer;
import com.tutorials.java.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorials.java.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController implements ICustomer {

	@Autowired
	private ICustomer customerService;

	@Override
	@RequestMapping
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@Override
	@RequestMapping("/{id}")
	public Customer getCustomerById(@PathVariable String id) {
		return customerService.getCustomerById(id);
	}
}

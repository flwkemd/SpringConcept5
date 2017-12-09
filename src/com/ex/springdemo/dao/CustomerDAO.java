package com.ex.springdemo.dao;

import java.util.List;

import com.ex.springdemo.entity.Customer;

public interface CustomerDAO {
 
	public List<Customer> getCustomers();

	public void saveCustomers(Customer theCustomer);
}

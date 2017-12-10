package com.ex.springdemo.dao;

import java.util.List;

import com.ex.springdemo.entity.Customer;

public interface CustomerDAO {
 
	public List<Customer> getCustomers();

	public void saveCustomers(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}

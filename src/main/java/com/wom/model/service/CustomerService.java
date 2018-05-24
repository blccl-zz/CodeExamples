package com.wom.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wom.model.Customer;
import com.wom.model.dao.CustomerDao;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public Customer findCustomer(String id) {
		return customerDao.findCustomer(id);
	}

	public Customer loginCustomer(String userId, String password) {
		Customer customer = this.findCustomer(userId);
		if (customer != null && customer.getPassword().equals(password)) {
			return customer;
		}
		return null;
	}
}

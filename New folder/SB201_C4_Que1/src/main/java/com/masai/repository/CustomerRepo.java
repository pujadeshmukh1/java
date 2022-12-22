package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Customer;
import com.masai.model.CustomerDTO;

public interface CustomerRepo  extends JpaRepository<Customer, Integer>{

	List<Customer> findByAddress(String address);

	List<Customer> getCustomersBetweenAge();

	List<CustomerDTO> getNameAddressAgeOfAllCustomers();

	Customer loginCustomer(String email, String password);

	
}

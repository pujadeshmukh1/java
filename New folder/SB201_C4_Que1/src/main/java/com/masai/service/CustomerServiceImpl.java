package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;

import com.masai.repository.CustomerRepo;




@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepo dao;

	@Override
	public Customer registerCustomer(Customer Customer) throws CustomerException {

        Customer c= dao.save(Customer);
		return null;
	}
	
	
	

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {
  
		Optional<Customer> opt=dao.findById(customerId);
		
		return opt.orElseThrow(()-> new CustomerException("Customer does not found ...."));
	}




	@Override
	public Customer loginCustomer(String email, String password) throws CustomerException {
		// TODO Auto-generated method stub
		
		Customer log = dao.loginCustomer(email, password);
		
		if(log.getPassword().isBlank()) {
			throw new CustomerException("Invalid");
		}
		else {
			 return log;
		}
	  
		
	}

	@Override
	public Customer updateCustomerPassword(String username, String oldPassword, String newPassword)
			throws CustomerException {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		// TODO Auto-generated method stub
		
		List<Customer> allcus = dao.findAll();
		
		if(allcus.isEmpty()) {
			throw new CustomerException();
		}
		else {
			return allcus;
		}
		
		
	}

	@Override
	public Customer deleteCustomerById(Integer customerId) throws CustomerException {
		// TODO Auto-generated method stub
		
		Optional<Customer> delete = dao.findById(customerId);
		
		if(delete.isPresent()) {
			dao.delete(delete.get());
		}
		else {
			throw new CustomerException("error 404");
		}
		return delete.get();
	
	}

	@Override
	public List<Customer> getCustomerDetailsByAddress(String address) throws CustomerException {
		// TODO Auto-generated method stub
		
		List<Customer> add = dao.findByAddress(address);
		
		if(add.isEmpty()) {
			throw new CustomerException("unknown address");
		}
		
		
		else {
			return add;
		}
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		Optional<Customer> upcus = dao.findById(customer.getCustomerId());
		
		if(upcus.isPresent()) {
			dao.save(customer);
		}else {
			throw new CustomerException("Not update");
		}
		
		return customer;
	}

	@Override
	public List<Customer> getCustomersBetweenAge(Integer start_age, Integer end_age) throws CustomerException {
		// TODO Auto-generated method stub
		List<Customer> getcus = dao.getCustomersBetweenAge();
		
		if(getcus.isEmpty()) {
			throw new CustomerException("Sorry ");
		}
		else {
			return getcus;
		}
		
	}

	@Override
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers() throws CustomerException {
		// TODO Auto-generated method stub
		
		List<CustomerDTO> allthree = dao.getNameAddressAgeOfAllCustomers();
		
		if(allthree.isEmpty()) {
			throw new CustomerException("error 404");
		}
		else {
			return allthree;
		}
		
	}


}

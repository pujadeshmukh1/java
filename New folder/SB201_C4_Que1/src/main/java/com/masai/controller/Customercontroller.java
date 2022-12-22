package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;

import com.masai.service.CustomerService;

@RestController
public class Customercontroller {

	 @Autowired
		private CustomerService cust;
	   
	   
	   @PostMapping("/register")
		public ResponseEntity<Customer> registercus(@RequestBody Customer emp) throws CustomerException {

			Customer c = cust.registerCustomer(emp);

			return new ResponseEntity<Customer>(c, HttpStatus.OK);

		}
	   @GetMapping("/getdeta")
	   public ResponseEntity<Customer> getbyid(@RequestBody Customer p)throws CustomerException{
		   
		   Customer f = cust.getCustomerById(p.getCustomerId());
		   
		   return new ResponseEntity<Customer>(f,HttpStatus.ACCEPTED);
		   
		   
	   }
	   
	   @GetMapping("/login")
		public ResponseEntity<Customer> loginHandler(@RequestParam("user") String username,
				@RequestParam("pass") String password) throws CustomerException {

			Customer c = cust.loginCustomer(username, password);

			return new ResponseEntity<Customer>(c, HttpStatus.ACCEPTED);
		}
	   
	   @GetMapping("/customers")
		public ResponseEntity<List<Customer>> getAllcustmers() throws CustomerException {

			List<Customer> elist = cust.getAllCustomerDetails();

			return new ResponseEntity<List<Customer>>(elist, HttpStatus.OK);
		}
	   @PutMapping("/customer")
		public ResponseEntity<Customer> updateEmployeehandler(@RequestBody Customer emp) throws CustomerException {

			Customer c = cust.updateCustomer(emp);

			return new ResponseEntity<Customer>(c, HttpStatus.OK);

		}
	   
		
	   @DeleteMapping("/customer/{id}")
		public ResponseEntity<Customer> deleecushandler(@PathVariable("id") Integer id) throws CustomerException {

			Customer c = cust.deleteCustomerById(id);

			return new ResponseEntity<Customer>(c, HttpStatus.OK);

		}
	   
	   
	   @GetMapping("/cuto/{address}")
		public ResponseEntity<List<Customer>> customerByAdress(@PathVariable("address") String address)
				throws CustomerException {

			List<Customer> elist = cust.getCustomerDetailsByAddress(address);

			return new ResponseEntity<List<Customer>>(elist, HttpStatus.OK);
		}
	   @GetMapping("/cutomb/{id}/{ids}")
	   public ResponseEntity<List<Customer>> betage(@PathVariable("id") Integer id , @PathVariable("ids")Integer ids) throws CustomerException{
		   
		   List<Customer> c = cust.getCustomersBetweenAge(id, ids);
		   
		   return new ResponseEntity<List<Customer>>(c,HttpStatus.ACCEPTED);
		   
	   }   
}

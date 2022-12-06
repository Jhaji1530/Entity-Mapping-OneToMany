package com.wecodee.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wecodee.jpa.Entity.Customer;
import com.wecodee.jpa.Entity.Products;
import com.wecodee.jpa.repository.CustomerRepository;
import com.wecodee.jpa.repository.ProductRepository;

@RestController
public class OrderController {
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository productRepository;

	//Add customer and product
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody Customer customer) {
		return customerRepository.save(customer);
		
	}
	
	//Fetch the  detail of all customer and product
	@GetMapping("/findAllProducts")
	public  List<Customer> findAllOrders()
	{
		return customerRepository.findAll();
	}

	//Fetch Product detail
	@GetMapping("/findOnlyProducts")
	public List<Products> findAllProducts()
	{
		return productRepository.findAll();
	}
	
	//Fetch Customer by id
	@GetMapping("/findCustomerById/{id}")
	public Optional<Customer> findCustomerById(@PathVariable int id)
	{
		return customerRepository.findById(id);
	}
	
	//Delete Customer by id
	@DeleteMapping("/deleteById/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		customerRepository.deleteById(id);
		return "id deleted";
	}
	
	//Update Customer
	@PutMapping("/update")
	public Object updateProduct(@RequestBody Customer customer)
	{
		return customerRepository.save(customer);
	}
}

package com.wecodee.jpa.dto;

import com.wecodee.jpa.Entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


public class OrderRequest 	
{
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public OrderRequest() {
		super();
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}
	
	
	
}

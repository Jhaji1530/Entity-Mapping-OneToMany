package com.wecodee.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wecodee.jpa.Entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

	Customer save(int id);
	
}

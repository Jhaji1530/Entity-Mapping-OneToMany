package com.wecodee.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecodee.jpa.Entity.Customer;
import com.wecodee.jpa.Entity.Products;

public interface ProductRepository extends JpaRepository<Products, Integer>
{

	Customer save(Customer customer);

}

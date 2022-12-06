package com.wecodee.jpa.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CUSTOMER")
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String  email;
	
	@Column
    @ElementCollection(targetClass=Products.class)
	@OneToMany(targetEntity = Products.class, cascade = CascadeType.ALL)
	@JoinColumn(name="id",referencedColumnName = "id")
	private List<Products> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public Customer(int id, String name, String email, List<Products> products) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.products = products;
	}

	public Customer() {
		super();
		
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", products=" + products + "]";
	}
	
}

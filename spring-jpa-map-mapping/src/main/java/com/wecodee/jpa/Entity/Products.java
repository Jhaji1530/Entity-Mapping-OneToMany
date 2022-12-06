package com.wecodee.jpa.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="PRODUCTS")
public class Products 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	private String pName;
	private int qty;
	private int price;
	
	
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Products(int pId, String pName, int qty, int price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.qty = qty;
		this.price = price;
	}
	public Products() {
		super();
	}
	@Override
	public String toString() {
		return "Products [pId=" + pId + ", pName=" + pName + ", qty=" + qty + ", price=" + price + "]";
	}
	
}

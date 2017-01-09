package com.dev.poc.medicalbilling.impl;

import com.dev.poc.medicalbilling.api.IShoppingCartElement;
import com.dev.poc.medicalbilling.api.IShoppingCartVisitor;



/**
 * CartItem holds the Med Health Service types, cost and qty.
 * @author Yogesh
 *
 */
public class CartItem implements IShoppingCartElement {
	
	private String medicalServiceType;
	
	private double price;
	
	private int  qty;
	
	private ShoppingCart shoppingCart;
	
	public CartItem(String medicalServiceType, double price, int qty) {
		super();
		this.medicalServiceType = medicalServiceType;
		this.price = price;
		this.qty = qty;
	}

	
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}



	public String getMedicalServiceType() {
		return medicalServiceType;
	}

	public void setMedicalServiceType(String medicalServiceType) {
		this.medicalServiceType = medicalServiceType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public void accept(IShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		
	}
	
}

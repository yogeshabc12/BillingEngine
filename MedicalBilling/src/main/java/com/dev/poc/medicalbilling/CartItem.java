package com.dev.poc.medicalbilling;

/**
 * CartItem holds the Med Health Service types, cost and qty.
 * @author Yogesh
 *
 */
public class CartItem {
	
	private String medicalServiceType;
	
	private double price;
	
	private int  qty;
	
	public CartItem(String medicalServiceType, double price, int qty) {
		super();
		this.medicalServiceType = medicalServiceType;
		this.price = price;
		this.qty = qty;
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
	
}

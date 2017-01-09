package com.dev.poc.medicalbilling.impl;


import java.util.ArrayList;
import java.util.List;

import com.dev.poc.medicalbilling.api.IShoppingCartElement;
import com.dev.poc.medicalbilling.api.IShoppingCartVisitor;

public class ShoppingCart implements IShoppingCartElement {
	
	private double totalBill;
	
	private List<IShoppingCartElement> cartItemList = new ArrayList<IShoppingCartElement>();
	
	public List<IShoppingCartElement> getCartItemList() {
		return cartItemList;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	public void addCartItem(CartItem cartItem) {
		cartItem.setShoppingCart(this);
		cartItemList.add(cartItem);
	}


	@Override
	public void accept(IShoppingCartVisitor visitor) {
		visitor.visitShoppingCart(this);
		
	}

}

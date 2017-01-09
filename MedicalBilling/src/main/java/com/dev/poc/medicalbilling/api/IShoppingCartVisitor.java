package com.dev.poc.medicalbilling.api;

import com.dev.poc.medicalbilling.impl.CartItem;
import com.dev.poc.medicalbilling.impl.ShoppingCart;

public interface IShoppingCartVisitor {
	
	public void visitCartItem(CartItem cartITem);
	
	public void visitShoppingCart(ShoppingCart shoppingCart);

}

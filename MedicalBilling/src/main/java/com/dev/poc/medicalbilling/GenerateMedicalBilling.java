package com.dev.poc.medicalbilling;

import com.dev.poc.medicalbilling.api.IShoppingCartVisitor;
import com.dev.poc.medicalbilling.impl.CartItem;
import com.dev.poc.medicalbilling.impl.ShoppingCart;
import com.dev.poc.medicalbilling.util.MediHealthEnum;


public class GenerateMedicalBilling implements IShoppingCartVisitor{

	@Override
	public void visitCartItem(CartItem cartITem) {
		double totalCost = 0.00;
		totalCost = cartITem.getPrice() * cartITem.getQty();
		if (cartITem.getMedicalServiceType().equals(MediHealthEnum.VACCINE.name())) {
			totalCost = totalCost + 27.50;
		}
		double totalBill = cartITem.getShoppingCart().getTotalBill();
		cartITem.getShoppingCart().setTotalBill(totalBill + totalCost);
	}

	@Override
	public void visitShoppingCart(ShoppingCart shoppingCart) {
		shoppingCart.getCartItemList().stream().forEach(item -> item.accept(this));
	}

}

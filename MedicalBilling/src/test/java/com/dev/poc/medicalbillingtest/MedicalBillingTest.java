package com.dev.poc.medicalbillingtest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dev.poc.medicalbilling.GenerateMedicalBilling;
import com.dev.poc.medicalbilling.impl.CartItem;
import com.dev.poc.medicalbilling.impl.ShoppingCart;
import com.dev.poc.medicalbilling.util.MediHealthEnum;

public class MedicalBillingTest {

	@Test
	public void whenOneMediHealthServiceThanTotalCost() throws Exception {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addCartItem(new CartItem(MediHealthEnum.DAGNOSIS.name(), 60.00, 1));
		shoppingCart.accept(new GenerateMedicalBilling());
		assertEquals("Total Billing Cost",shoppingCart.getTotalBill(), 60.00, 0);
	}
	
	@Test
	public void whenTwoMediHealthServiceThanTotalCost() throws Exception {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addCartItem(new CartItem(MediHealthEnum.DAGNOSIS.name(), 60.00, 1));
		shoppingCart.addCartItem(new CartItem(MediHealthEnum.X_RAY.name(), 150.00, 1));
		shoppingCart.accept(new GenerateMedicalBilling());
		assertEquals("Total Billing Cost",shoppingCart.getTotalBill(), 210.00, 0);
	}

}

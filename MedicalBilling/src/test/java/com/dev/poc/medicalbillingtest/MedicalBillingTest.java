package com.dev.poc.medicalbillingtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedicalBillingTest {

	@Test
	public void whenOneMediHealthServiceThanTotalCost() throws Exception {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addCartItem(new CartItem("Diagnosis", 60.00, 1));
		shoppingCart.accept(new GenerateMedicalBilling());
		assertEquals("Total Billing Cost",shoppingCart.getTotalBill(), 60.00, 0);
	}

}

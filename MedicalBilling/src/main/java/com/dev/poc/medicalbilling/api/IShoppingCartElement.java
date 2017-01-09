package com.dev.poc.medicalbilling.api;

public interface IShoppingCartElement {
	
	public void accept(IShoppingCartVisitor visitor);

}

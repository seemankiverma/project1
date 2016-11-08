package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.cartitem_dao_interface;
import com.models.cart_item;

@Service
public abstract class cartitem_service implements cartitem_interface{
	@Autowired
	private cartitem_dao_interface cartItemDao;
	
	public cartitem_dao_interface getCartItemDao() {
		return cartItemDao;
	}

	public void setCartItemDao(cartitem_dao_interface cartItemDao)
	{
		this.cartItemDao = cartItemDao;
	}

	@Override
	public void addCartItem(cartitem_dao_interface cartItem)
	{
		cartitem_dao_interface.addCartItem(cartItem);
		
	}

}
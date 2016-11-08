package com.services;

import com.dao.cartitem_dao_interface;
import com.models.cart_item;

public interface cartitem_interface 
{
	void addCartitem(cartitem_interface cart_item);

	void addCartItem(cartitem_dao_interface cart_item);
}

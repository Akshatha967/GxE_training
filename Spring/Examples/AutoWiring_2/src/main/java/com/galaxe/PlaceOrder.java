package com.galaxe;

import com.galaxe.model.Order;

public class PlaceOrder {

	private SellerPortal sellerPortals ;
	
//	public SellerPortal getSp() {
//		return sellerPortals;
//	}
//	PlaceOrder(SellerPortal sellerPortal){
//		System.out.println("cons");
//		this.sellerPortals=sellerPortals;
//	}
//	
//	PlaceOrder(){
//		System.out.println("cons");
//	
//	}
	public void setSellerPortals(SellerPortal sp) {
		this.sellerPortals = sp;
	}
	
	public void placeorder(Order order) {
		System.out.println("placeing order ..."+order.toString());;
		System.out.println("seller ...");
		sellerPortals.createorder(order);
		
	}
}

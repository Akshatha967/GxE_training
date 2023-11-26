package com.galaxe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.galaxe.PlaceOrder;
import com.galaxe.model.Order;

public class OrderTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory  factory = new ClassPathXmlApplicationContext("application-context.xml");
		//factory.registerShutdownHook();
		Order order = new Order();
		order.setOrder_id(1);
		order.setPrice(100);
		order.setProd_name("redmi");
		order.setProd_qty(1);
		PlaceOrder sender =  (PlaceOrder ) factory.getBean(PlaceOrder.class);		
		sender.placeorder(order);
	}

}

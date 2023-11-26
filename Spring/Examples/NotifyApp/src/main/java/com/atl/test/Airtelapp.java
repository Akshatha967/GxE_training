package com.atl.test;

import com.atl.CommunicationChannel;

import com.atl.MessageSender;
import com.atl.msg.Car;
import com.atl.msg.MessageSenders;
import org.springframework.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class Airtelapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BeanFactory  factory = new ClassPathXmlApplicationContext("application-context.xml");
		//factory.registerShutdownHook();
		
		MessageSenders sender =  (MessageSenders) factory.getBean("MessageSender");		
		sender.notifySender("this is message- plan expiry  message "+sender.hashCode());
	   
		((ClassPathXmlApplicationContext) factory).close();
		
		/*
		 * When the scope is not given by default the scope is singleton and hence only one object is created per ioc container.
		 */
//		MessageSenders sender2 =  (MessageSenders) factory.getBean("MessageSender");		
//		sender.notifySender("this is message- plan expiry  message "+sender2.hashCode());

		
		/*
		 * when the scope is specified as prototype , more than one object can be created.
		 */
		//((ConfigurableBeanFactory) factory).destroySingletons();
		
		
		ConfigurableApplicationContext factory1 = new ClassPathXmlApplicationContext("application-context.xml");
		//factory.registerShutdownHook();
		Car obj = (Car)factory1.getBean("BMW");
		System.out.println(obj.getEngineModel()+" "+obj.getModel());
		
	}

}

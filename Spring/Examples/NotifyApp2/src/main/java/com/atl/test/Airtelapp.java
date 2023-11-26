package com.atl.test;

import com.atl.CommunicationChannel;

import com.atl.MessageSender;
import com.atl.config.Configurations;
import com.atl.msg.Car;
import com.atl.msg.MessageSenders;
import org.springframework.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Airtelapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BeanFactory  factory = new AnnotationConfigApplicationContext(Configurations.class);
		
		System.out.println("------------------");
		MessageSenders sender =  (MessageSenders) factory.getBean("getsender");
		
		MessageSender sender2 =  factory.getBean("getsender",MessageSender.class);
		
		
		sender.notifySender("this is message- plan expiry  message "+sender.hashCode());
	   
		((AnnotationConfigApplicationContext) factory).close();
		

		
		
		
		
	}

}

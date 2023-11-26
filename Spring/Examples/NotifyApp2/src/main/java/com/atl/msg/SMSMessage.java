package com.atl.msg;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.atl.CommunicationChannel;


//@Component
public class SMSMessage implements CommunicationChannel {

	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("sms : "+ msg);
	}


	@PostConstruct
	public void init() {
		System.out.println("init of sms");
	}
}

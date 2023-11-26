package com.atl.msg;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.atl.CommunicationChannel;


@Component
//@Lazy
@Primary
public class EmailMessage implements CommunicationChannel{

	
//	static
//	{
//		System.out.println("lazy_email");
//	}
	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("email :"+msg);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init of email");
	}

}

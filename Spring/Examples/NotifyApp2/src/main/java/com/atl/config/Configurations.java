package com.atl.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.atl.CommunicationChannel;
import com.atl.MessageSender;
import com.atl.msg.EmailMessage;
import com.atl.msg.MessageSenders;
import com.atl.msg.SMSMessage;

@Configuration
@ComponentScan("com.atl")
public class Configurations {

	@PostConstruct
	public void init() {
		System.out.println("init of config");
	}
	
	@Bean 
	public MessageSender getsender(){
		return new MessageSenders() ;
	} 
	
	@Bean 
	//@Primary
	public CommunicationChannel getSChannel() {
		return new SMSMessage();
	}
	
	@Bean 
	public CommunicationChannel getChannel() {
		System.out.println("bean - email config");
		return new EmailMessage();
	}

	
	
	
}


/*
 * when we don't have the source code, 
 * we can use @bean annotation 
 * as we can't specify the component , service , etc
 */

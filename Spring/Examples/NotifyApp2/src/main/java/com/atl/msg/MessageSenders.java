package com.atl.msg;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.atl.CommunicationChannel;
import com.atl.MessageSender;


//@Component
public class MessageSenders implements MessageSender, DisposableBean{

	@PostConstruct
	public void init() {
		System.out.println("initialization method called message sender"+channel);
		
	}
	
	@Inject
//	@Qualifier("getSChannel") // used primary
	CommunicationChannel channel;
//
//	@Autowired
//	@Qualifier("getChannel")
	public void setChannel(CommunicationChannel channel) {
		
		this.channel = channel;
		System.out.println("set method"+ channel);
	}

//	public MessageSenders(CommunicationChannel channel) {
//		
//		System.out.println("Constructor para initialized"+channel);
//		this.channel=channel;
//	}
	
	public MessageSenders() {			
			System.out.println("Constructor initialized"+channel);	
	}
	
	

	@Override
	public void notifySender(String message) {
		// TODO Auto-generated method stub
		channel.sendMessage(message);
	}
	
	public void setchannel(CommunicationChannel channel) {
		// TODO Auto-generated method stub
		this.channel=channel;
	}
	
	@PreDestroy
	public void destroyObj() {
		System.out.println("destroy method called");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method of disposable is called called");
	}

}

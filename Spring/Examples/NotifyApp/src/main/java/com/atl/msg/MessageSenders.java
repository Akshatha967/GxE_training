package com.atl.msg;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;

import com.atl.CommunicationChannel;
import com.atl.MessageSender;

public class MessageSenders implements MessageSender, DisposableBean{

	public void init() {
		System.out.println("initialization method called");
		
	}
	CommunicationChannel channel;

	
	
	public MessageSenders(CommunicationChannel channel) {
		
		System.out.println("Constructor initialized"+channel);
		this.channel=channel;
	}
	
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
	
	public void destroyObj() {
		System.out.println("destroy method called");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method of disposable is called called");
	}

}

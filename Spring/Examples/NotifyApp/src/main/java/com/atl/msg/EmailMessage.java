package com.atl.msg;

import com.atl.CommunicationChannel;

public class EmailMessage implements CommunicationChannel{

	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("email :"+msg);
	}

}

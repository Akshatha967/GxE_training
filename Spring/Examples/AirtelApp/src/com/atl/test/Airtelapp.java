package com.atl.test;

import com.atl.CommunicationChannel;
import com.atl.CommunicationChannelFac;
import com.atl.MessageSender;
import com.atl.msg.MessageSenders;

public class Airtelapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommunicationChannel channel = CommunicationChannelFac.getChannel("email");
		MessageSender sender =  new MessageSenders();
		sender.getCHannel(channel);
		sender.notifySender("this is email message ");
		
	}

}

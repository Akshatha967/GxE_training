package com.atl.msg;

import com.atl.CommunicationChannel;
import com.atl.MessageSender;

public class MessageSenders implements MessageSender{

	CommunicationChannel channel;

	@Override
	public void notifySender(String message) {
		// TODO Auto-generated method stub
		channel.sendMessage(message);
	}

	public void getCHannel(CommunicationChannel channel) {
		// TODO Auto-generated method stub
		this.channel=channel;
	}

}

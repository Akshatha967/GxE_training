package com.atl;

import com.atl.msg.EmailMessage;
import com.atl.msg.SMSMessage;

public class CommunicationChannelFac {

	public static CommunicationChannel getChannel(String channelType) {
		if(channelType.trim().equalsIgnoreCase("SMS")) {
			return new SMSMessage();
		}
		else if (channelType.trim().equals("email")) {
			return new EmailMessage();
		}
		return null;
	}
}

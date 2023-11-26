package com.example.demo.request;

import org.springframework.stereotype.Component;

@Component
public class RechargeRequest {

	String ph;
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	float amount;
}

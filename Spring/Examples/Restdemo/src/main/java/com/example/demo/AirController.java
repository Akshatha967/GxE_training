package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.RechargeRequest;

@RequestMapping("/airtel-service")
@RestController
public class AirController {

	@PostMapping("/recharge")
	public String recharge(@RequestBody RechargeRequest req) {
		System.out.println("req:"+req.toString());
		return "success";
	}
}

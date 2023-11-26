package com.amaz.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CustomerDto {

	private int id;
	private String name;
	private String phone;
	private String email;
	private Date dob;
}

package com.amaz.mapper;

import org.springframework.stereotype.Component;

import com.amaz.dto.CustomerDto;
import com.amaz.entities.Customer;

@Component
public class CustMapper {

	public CustomerDto toCustdto(Customer cust) {
		CustomerDto dto = new CustomerDto();
		dto.setDob(cust.getDob());
		dto.setEmail(cust.getEmail());
		dto.setId(cust.getId());
		dto.setName(cust.getName());
		dto.setPhone(cust.getPhone());
		return dto;
		
	}
	

	public Customer toCustdto(CustomerDto dto) {
		Customer cust = new Customer();
		
		cust.setDob(dto.getDob());
		cust.setEmail(dto.getEmail());
		cust.setId(dto.getId());
		cust.setName(dto.getName());
		cust.setPhone(dto.getPhone());
		return cust;
		
	}
}

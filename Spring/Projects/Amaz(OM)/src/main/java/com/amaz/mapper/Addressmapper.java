package com.amaz.mapper;

import org.springframework.stereotype.Component;

import com.amaz.dto.AddressDto;
import com.amaz.dto.CustomerDto;
import com.amaz.entities.Address;
import com.amaz.entities.Customer;

@Component
public class Addressmapper {

	public AddressDto toAdddto(Address add) {
		AddressDto addDto = new AddressDto();
		addDto.setAddress1(add.getAddress1());
		addDto.setAddress2(add.getAddress2());
		addDto.setCity(add.getCity());
		addDto.setPin(add.getPin());
		addDto.setId(add.getId());
		
		return addDto;
		
	}
	

	public Address toAdd(AddressDto add) {
		
		Address addDto = new Address();
		addDto.setAddress1(add.getAddress1());
		addDto.setAddress2(add.getAddress2());
		addDto.setCity(add.getCity());
		addDto.setPin(add.getPin());
		addDto.setId(add.getId());	
		return addDto;
	}
}

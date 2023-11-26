package com.amaz.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amaz.dto.CustomerDto;
import com.amaz.entities.Customer;

@Repository
public interface CustService {

	public CustomerDto getcustomer(int id);
	public void saveCust(CustomerDto ccustDto);
}

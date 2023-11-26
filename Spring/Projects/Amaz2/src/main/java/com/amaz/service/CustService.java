package com.amaz.service;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.amaz.dto.CustomerDto;
import com.amaz.entities.Customer;

@Service
public interface CustService {

	public CustomerDto getcustomer(int id);
	public CustomerDto saveCust(CustomerDto custDto);
	public String delcustomer(int id) ;
	public CustomerDto updateCust(CustomerDto ccustDto);
	
	public List<CustomerDto> findByNameStartingWith(String prefix);
	public List<CustomerDto> findByAgeBetween(Date startAge, Date endAge);
	

	public List<CustomerDto> findBydob(Date dob);
	public List<CustomerDto> findAllName(String name);
}

package com.amaz.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.amaz.dto.CustomerDto;
import com.amaz.entities.Customer;
import com.amaz.exc.ResNotFound;
import com.amaz.mapper.CustMapper;
import com.amaz.repo.CutRepo;
import com.amaz.service.CustService;

public class CustServImp implements CustService {

	@Autowired
	private CutRepo custrepo;
	@Autowired
	private CustMapper custmap;
	
	@Override
	public CustomerDto getcustomer(int id) {
		// TODO Auto-generated method stub
		
		Optional<Customer> customer = custrepo.findById(id);
		if(customer.isPresent()) {
			return custmap.toCustdto(customer.get());
		}
		else {
			throw new ResNotFound("no custoer found with id="+id);
		}
	}

	@Override
	public void saveCust(CustomerDto ccustDto) {
		// TODO Auto-generated method stub
		
	}

}

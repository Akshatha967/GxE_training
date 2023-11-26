package com.amaz.impl;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amaz.dto.AddressDto;
import com.amaz.dto.CustomerDto;
import com.amaz.entities.Address;
import com.amaz.entities.Customer;
import com.amaz.exc.ResNotFound;
import com.amaz.mapper.Addressmapper;
import com.amaz.mapper.CustMapper;
import com.amaz.repo.AddRepo;
import com.amaz.repo.CutRepo;
import com.amaz.service.CustService;

@Service
public class CustServImp implements CustService {

	@Autowired
	private CutRepo custrepo;
	@Autowired
	private CustMapper custmap;
	@Autowired
	private Addressmapper addmap;
	@Autowired
	private AddRepo addrepo;
	
	@Override
	public CustomerDto getcustomer(int id) {
		// TODO Auto-generated method stub
		Optional<Customer> customer = custrepo.findById(id);
		if(customer.isPresent()) {
			return custmap.toCustdto(customer.get());
		}
		else {
			throw new ResNotFound("no customer found with id="+id);
		}
	}

	@Override
	public CustomerDto saveCust(CustomerDto custDto) {
		// TODO Auto-generated method stub
		
		Customer customer =custrepo.save(custmap.toCust(custDto));
		CustomerDto  custdto = custmap.toCustdto(customer);
		AddressDto addDto = custDto.getAddressDto();
		System.out.println(addDto+" "+custDto);
		Address address = addmap.toAdd(addDto);
		address.setCustomer(customer);
		addrepo.save(address);
		
		AddressDto addDto2 = addmap.toAdddto(address);
		custdto.setAddressDto(addDto2);
		return custdto;
//		try{
//			custrepo.save(cust);
//			return getcustomer(cust.getId());
//		}catch(Exception e) {
//			throw new ResNotFound(e.getMessage());
//		}
	}

	@Override
	public String delcustomer(int id) {
		// TODO Auto-generated method stub
		Optional<Customer> customer = custrepo.findById(id);
		if(customer.isPresent()) {
			custrepo.deleteById(customer.get().getId());
			return "Customer deleted";
		}
		else {
			throw new ResNotFound("no customer found with id="+id);
		}
	}

	@Override
	public CustomerDto updateCust(CustomerDto custDto) {
//		// TODO Auto-generated method stub
		Optional<Customer> customer = custrepo.findById(custDto.getId());
		if(customer.isPresent()) {
			custrepo.save(custmap.toCust(custDto));
			return custDto;
		}
		else {
			throw new ResNotFound("no custmoer found with id="+custDto.getId());
		}
		
	}

	@Override
	public List<CustomerDto> findByNameStartingWith(String prefix) {
		// TODO Auto-generated method stub
		List<CustomerDto> cust = new ArrayList<>();
		List<Customer> customer = custrepo.findByNameStartingWith(prefix);
		for(Customer c : customer) {
			cust.add(custmap.toCustdto(c));
		}
		return cust;
	}

	@Override
	public List<CustomerDto> findByAgeBetween(Date startAge, Date endAge) {
		// TODO Auto-generated method stub
		List<CustomerDto> cust = new ArrayList<>();
		List<Customer> customer = custrepo.findBydobBetween(startAge, endAge);
		for(Customer c : customer) {
			cust.add(custmap.toCustdto(c));
		}
		return cust;
	}

	@Override
	public List<CustomerDto> findBydob(Date dob) {
		// TODO Auto-generated method stub
		List<CustomerDto> cust = new ArrayList<>();
		List<Customer> customer = custrepo.findBydob(dob);
		for(Customer c : customer) {
			cust.add(custmap.toCustdto(c));
		}
		return cust;
	}

	@Override
	public List<CustomerDto> findAllName(String name) {
		// TODO Auto-generated method stub
		List<CustomerDto> cust = new ArrayList<>();
		List<Customer> customer = custrepo.findByName(name);
//		List<Customer> customer = custrepo.findAll();
		for(Customer c : customer) {
			cust.add(custmap.toCustdto(c));
		}
		return cust;
	}

}

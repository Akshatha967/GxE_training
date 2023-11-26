package com.amaz.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.amaz.dto.CustomerDto;
import com.amaz.entities.Customer;

@Repository
public interface CutRepo extends JpaRepository<Customer,Integer>  {


	List<Customer> findByNameStartingWith(String prefix);
	List<Customer> findBydobBetween(Date startAge,Date endAge);
	
	@Query("SELECT c FROM Customer c")
	List<Customer> findAll();
	
	@Query("SELECT c FROM Customer c WHERE c.name=:name")
	List<Customer> findByName(@Param("name") String name);
	
	@Query (value="Select * from customer where dob=?",nativeQuery=true)	
	List<Customer> findBydob(Date dob);
	
//	@Query(value="Select * from customer where name=?",nativeQuery=true)
//	List<Customer> findAllCustomer(@Param("name") String name);
	
	
}

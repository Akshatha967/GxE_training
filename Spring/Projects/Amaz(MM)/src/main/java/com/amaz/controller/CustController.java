package com.amaz.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amaz.dto.CustomerDto;
import com.amaz.exc.ResNotFound;
import com.amaz.service.CustService;

//@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/perform")

public class CustController {
	
	@Autowired
	private CustService cs;
	
	/*	Read operation
	 *  The method gets the customer with a given id
	 * Service class is the one with all the service implementations
	 * the object of service class is used for getting the customer
	 */
	@GetMapping("/getcust/{id}")
	public ResponseEntity<?> getcustomer(@PathVariable("id") int id) {
		return new ResponseEntity<>(cs.getcustomer(id),HttpStatus.OK);
			
	}

	/* 
	 * The method saves the customer to the database.
	 * create operation
	 */
	@PostMapping("/savecust")
	public  ResponseEntity<?> saveCust(@RequestBody CustomerDto ccustDto) {
		System.out.println(ccustDto);
		return new ResponseEntity<>(cs.saveCust(ccustDto),HttpStatus.CREATED);
	}
	
	/*
	 * Delete operation printing OK status message , if the operation is successful
	 * else the handler is executed
	 */
	@DeleteMapping("/delcust")
	public ResponseEntity<?> delcustomer(@RequestParam("id") int id) {
		return new ResponseEntity<>(cs.delcustomer(id),HttpStatus.OK);

	}
	
	/*
	 * Update operation, printing OK status message , if the operation is successful
	 * else the handler is executed
	 */
	@PutMapping("/updatecust")
	public ResponseEntity<?>  updateCust(@RequestBody CustomerDto ccustDto) {
		return new ResponseEntity<>(cs.updateCust(ccustDto),HttpStatus.OK);
	}
	
	@GetMapping("/fname_start")
	public ResponseEntity<?> getfname(@RequestParam("name") String name) {
		return new ResponseEntity<>(cs.findByNameStartingWith(name),HttpStatus.OK);
			
	}
	
	@GetMapping("/dob_bwn")
	public ResponseEntity<?> getDobbwn(@RequestParam("startDate") Date startdate, @RequestParam("EndDate")Date enddate) {
		return new ResponseEntity<>(cs.findByAgeBetween(startdate, enddate),HttpStatus.OK);
			
	}
	
	@GetMapping("/find_dob")
	public ResponseEntity<?> findDob(@RequestParam("dob") Date dob) {
		return new ResponseEntity<>(cs.findBydob(dob),HttpStatus.OK);
			
	}
	
	@GetMapping("/find_name")
	public ResponseEntity<?> findname(@RequestParam("name") String name) {
		return new ResponseEntity<>(cs.findAllName(name),HttpStatus.OK);
			
	}
	

}

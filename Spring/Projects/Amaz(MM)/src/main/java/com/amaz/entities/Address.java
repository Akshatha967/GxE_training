package com.amaz.entities;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="address")
@Data

public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="address1")
	private String address1;
	@Column(name="address2")
	private String address2;
	@Column(name="city")
	private String city;
	@Column(name="pin")
	private int pin;
	
	
	/*
	 * The relationship here is many to one with the customer table
	 */
	@ManyToMany(cascade=CascadeType.REFRESH)
	@JoinTable(name="cust_add",joinColumns=@JoinColumn(name="add_id"),inverseJoinColumns=@JoinColumn(name="cust_id"))
	private List<Customer> customer;
}

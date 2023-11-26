package com.amaz.repo;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amaz.entities.Customer;

@Repository
public interface CutRepo extends JpaRepository<Customer,Integer>  {


}

package com.amaz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amaz.dto.Resultdto;
import com.amaz.entities.Customer;

public interface ResRepo  extends JpaRepository<Resultdto,Integer>  {

	
}

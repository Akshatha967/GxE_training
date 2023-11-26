package com.amaz.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amaz.entities.Address;
import com.amaz.entities.Customer;

@Repository
public interface AddRepo extends JpaRepository<Address,Integer>   {

}

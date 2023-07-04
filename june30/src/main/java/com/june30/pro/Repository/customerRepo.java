package com.june30.pro.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.june30.pro.Entity.customerDetails;

public interface customerRepo extends JpaRepository<customerDetails, UUID>{
	

}

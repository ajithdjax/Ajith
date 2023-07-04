package com.june30.pro.service;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.june30.pro.Entity.customerDetails;
import com.june30.pro.dto.customerDetailsdto;

public interface customerService {

	public customerDetails details(@RequestBody customerDetailsdto datas);
	public List<customerDetails> getall(); 
	public customerDetails removedatas(@RequestBody customerDetailsdto datas);
	public customerDetails updatedatas(@RequestBody customerDetailsdto datas);
}

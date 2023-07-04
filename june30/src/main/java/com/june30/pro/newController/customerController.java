package com.june30.pro.newController;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.june30.pro.Entity.customerDetails;
import com.june30.pro.dto.customerDetailsdto;
import com.june30.pro.serviceimpl.customerDetailsIMPL;

@RestController
@RequestMapping("/api/customers")
public class customerController {
	
	@Autowired
	private customerDetailsIMPL allDetails;
	
	
	@PostMapping()
	public customerDetails postDetails(@RequestBody customerDetailsdto datas) {
		customerDetails post=allDetails.details(datas);
		return post;
		
	}
    
	@GetMapping("all")
	public List<customerDetails> getall() {
		return allDetails.getall();
	}
	
	@GetMapping("name")
	public String name() {
		return "ajith";
	}
	
	@DeleteMapping("remove")
	public customerDetails removedatas(@RequestBody customerDetailsdto datas) {
		return allDetails.removedatas(datas);
	}
	
    @PutMapping("update")
	public customerDetails updatedatas(@RequestBody customerDetailsdto datas) {
    	customerDetails update = allDetails.updatedatas(datas);
		return update;
	}
	
	
}

package com.june30.pro.serviceimpl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.june30.pro.Entity.customerDetails;
import com.june30.pro.Repository.customerRepo;
import com.june30.pro.dto.customerDetailsdto;
import com.june30.pro.service.customerService;

@Service
public class customerDetailsIMPL implements customerService {

	@Autowired
	private customerRepo repo;

	@Override
	public customerDetails details(customerDetailsdto datas) {
		customerDetails c = new customerDetails();
		c.setCity(datas.getCity());
		c.setName(datas.getName());
		c.setPhone(datas.getPhone());
		c.setDateOfBirth(datas.getDateofbirth());
		c.setCountry(datas.getCountry());
		c.setEmail(datas.getEmail());
		repo.save(c);
		return c;
	}

	@Override
	public List<customerDetails> getall() {
		
		List<customerDetails> cd = repo.findAll();
	
		return cd;
	}

	@Override
	public customerDetails removedatas(customerDetailsdto datas) {
		customerDetails c = repo.findById(datas.getId()).orElse(null);
		c.setCity(datas.getCity());
		c.setName(datas.getName());
		c.setPhone(datas.getPhone());
		c.setDateOfBirth(datas.getDateofbirth());
		c.setCountry(datas.getCountry());
		c.setEmail(datas.getEmail());
		repo.delete(c);
		return c;
	}

	@Override
	public customerDetails updatedatas(customerDetailsdto datas) {
		customerDetails c = repo.findById(datas.getId()).orElse(null);
		if(c!=null) {
			c.setCity(datas.getCity());
			c.setName(datas.getName());
			c.setPhone(datas.getPhone());
			c.setDateOfBirth(datas.getDateofbirth());
			c.setCountry(datas.getCountry());
			c.setEmail(datas.getEmail());
			repo.save(c);
		}
		return c;
	}

	
}

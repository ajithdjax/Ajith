package com.june30.pro.newController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newOne {

	@GetMapping("/new")
	public String myname() {
		return "ajith_newone";
	}
}

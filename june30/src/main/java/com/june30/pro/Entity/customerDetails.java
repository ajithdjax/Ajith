package com.june30.pro.Entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class customerDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID id;
	private String name;
	private String phone;
	private String city;
	private String dateOfBirth;
	private String Email;
	private String country;
	
	
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	
	
	
	
	public customerDetails(UUID id, String name, String phone, String city, String dateOfBirth, String email,
			String country) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.dateOfBirth = dateOfBirth;
		this.Email = email;
		this.country = country;
	}
	public customerDetails() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}

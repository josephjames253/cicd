package com.ust.app.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.app.hellospring.model.Customer;

@RestController
public class MyRestController {

	@GetMapping
	public String sayHello() {
		return "Hello World.....Welcome to Spring boot...THIS IS DEFAULT";
	}
	
	@GetMapping("/hello")
	public String greet() {
		return "Good AfterNoon everyone..THIS IS PRINTED BECAUSE GET MAPPING HAS /HELLO ALONG WITH IT";
	}
	
	@GetMapping("/Customer")
	public Customer getCustomer() {
		Customer c=new Customer(1001,"Joseph","joseph@gmail.com");
		return c;
	}
	//dynamic
	@GetMapping("/hello/{username}")
	public String greet(@PathVariable String username) {
		return "Good AfterNoon "+username ;
	}
	
	@PostMapping("/Customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return customer;
	}
	
	
}

package com.revature.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Customer;

@RestController
public class CustomerController {
	@GetMapping("/greet")
	public String welcome() {
		return "welcome to revature buddy";
	}
	@GetMapping("/greeting")
	public String invite() {
		System.out.println("Hello buddy");
		return "greeting to you Budddy";
	}
	@GetMapping("/customers")
	public List<Customer> getCustomer() {
		return Arrays.asList(new Customer(100, "rajesh"),new Customer(101, "vijay"));
	}
}

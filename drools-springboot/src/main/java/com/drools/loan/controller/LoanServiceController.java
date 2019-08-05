package com.drools.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drools.loan.model.Customer;
import com.drools.loan.service.LoanService;

@RestController
public class LoanServiceController {
	
	private final LoanService loanService;
	
	@Autowired
	public LoanServiceController(LoanService loanService) {
		this.loanService = loanService;
	}
	
	@RequestMapping(value = "/api/rules/loanApproval/getDecision", method = RequestMethod.POST)
	public Customer getLoanDecision(@RequestBody Customer customer) {
					
		customer = loanService.getLoanDecision(customer);
		System.out.println("userId :: " + customer.getUserId() + " :: decision :: " + customer.getLoanDecision());
		return customer;
	}

}

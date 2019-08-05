package com.drools.loan.service;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drools.loan.model.Customer;

@Service
public class LoanService {

	private final KieSession kieSession;
	
	@Autowired
	public LoanService(KieSession kieSession) {
		this.kieSession = kieSession;
	}
	
	public Customer getLoanDecision(Customer customer) {
		kieSession.insert(customer);
		kieSession.fireAllRules();		
		return customer;
	}
}

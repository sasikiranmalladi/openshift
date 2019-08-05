package com.drools.loan.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.drools.*"})
public class SpringBootDroolsLoanApp extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootDroolsLoanApp.class);
	}
	
    public static void main( String[] args )
    {
        SpringApplication.run(SpringBootDroolsLoanApp.class, args);
    }
}

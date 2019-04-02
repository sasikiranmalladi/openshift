package com.bpm.camunda;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableProcessApplication
public class CamundaWebApp 
{
    public static void main( String[] args )
    {
        // comments new
    	SpringApplication.run(CamundaWebApp.class, args);
    }
}

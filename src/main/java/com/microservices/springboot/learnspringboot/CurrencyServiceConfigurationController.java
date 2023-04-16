package com.microservices.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceConfigurationController {

	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;
	
	//localhost:8080/currency-service
	@GetMapping("/currency-service")
	public CurrencyServiceConfiguration retriveCurrencyService(){
		return currencyServiceConfiguration;
	}
	
}

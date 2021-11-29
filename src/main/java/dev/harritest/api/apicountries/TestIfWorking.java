package dev.harritest.api.apicountries;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dev.harritest.api.apicountries.countries.CountriesTest;

@RestController
public class TestIfWorking {

	
	@GetMapping("/say-hi")
	public String sayHi() {
		return "hi iam working ok <br> lets get started";
	
	}
	
	@GetMapping(path = "/countries-test/{cnt}")
	public CountriesTest listByCountry(@PathVariable String cnt) {
		
		return new CountriesTest(cnt); 
	}
	
}

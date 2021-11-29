package dev.harritest.api.apicountries.countries;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CountryResource {

	@Autowired
	private CountryDaoService service;

	@GetMapping("/countries")
	public List<Country> retrieveAllUsers() {
		return service.findAll();
	}

	@GetMapping("/countries/{code}")
	public Country retrieveUser(@PathVariable String code) {
		
		Country country = service.findOne(code);
		
		if(country==null)
			throw new UserNotFoundException("code-"+ code);
		
		
		return country;
	}


}

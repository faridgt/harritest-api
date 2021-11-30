package dev.harritest.api.apicountries.countries;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class CountryResource {

	@Autowired
	private CountryDaoService service;

	@GetMapping("/countries-test")
	public List<Country> retrieveAllUsers() {
		return service.findAll();
	}

	@GetMapping("/countries-test/{code}")
	public Country retrieveUser(@PathVariable String code) {
		
		Country country = service.findOne(code);
		
		if(country==null)
			throw new UserNotFoundException("code-"+ code);
		
		
		return country;
	}
	
	@PostMapping("/country-test")
	public ResponseEntity<Object> createUser(@Valid @RequestBody Country country) {
		Country savedCountry = service.save(country);
		// CREATED

		URI location = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{code}")
			.buildAndExpand(savedCountry.getCode()).toUri();
		
		return ResponseEntity.created(location).build();
		
	}


}

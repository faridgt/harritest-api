package dev.harritest.api.apicountries.countries;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ContinentJPAResource {

	@Autowired
	private CountryDaoService service;

	@Autowired
	private ContinentRepository continentRepository;
	
	@GetMapping("/continents")
	public List<Continent> retrieveAllContinents() {
		return continentRepository.findAll();
	}
/*
	@GetMapping("/continents/{code}")
	public Continent retrieveUser(@PathVariable String code) {
		
		Country country = service.findOne(code);
		
		if(country==null)
			throw new UserNotFoundException("code-"+ code);
		
		
		return country;
	}
	
*/

}

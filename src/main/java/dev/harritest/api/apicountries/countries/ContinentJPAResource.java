package dev.harritest.api.apicountries.countries;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ContinentJPAResource {

//	@Autowired
//	private CountryDaoService service;

	@Autowired
	private ContinentRepository continentRepository;
	
	@GetMapping("/continents")
	public List<Continent> retrieveAllContinents() {
		return continentRepository.findAll();
	}

	
	@GetMapping("/continents/{code}")
	public EntityModel<Continent> retrieveContinent(@PathVariable String code) {
	    
		Continent c=new Continent();
		c.setCode(code);
		Example<Continent> example = Example.of(c);
	    
		Optional<Continent> continent = continentRepository.findOne(example);

		if (!continent.isPresent())
			throw new UserNotFoundException("code-" + code);

		EntityModel<Continent> resource = EntityModel.of(continent.get());//new EntityModel<User>(user.get());

		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllContinents());

		resource.add(linkTo.withRel("all-continents"));



		return resource;
	}


}

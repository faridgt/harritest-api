package dev.harritest.api.apicountries.countries;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CountryJPAResource {



	@Autowired
	private CountryRepository cntRepository;
	

	@GetMapping("/countries/{fetchtype}")
    public List<Country> retrieveAllContinents(@PathVariable String fetchtype,
                        @RequestParam(defaultValue = "0") Integer pageNo, 
                        @RequestParam(defaultValue = "10") Integer pageSize,
                        @RequestParam(defaultValue = "id") String sortBy) 
    {
		
		if(fetchtype!=null&&fetchtype.equals("all"))
			pageSize=10000;
		
		Pageable paging = PageRequest.of(pageNo, pageSize);
		 
	      
		Page<Country> pagedResult = cntRepository.findAll(paging); 
		  if(pagedResult.hasContent()) {
	            return pagedResult.getContent();
	        } else {
	        return new ArrayList<Country>();	
	        }
	       
		  
		  
	       		
        
   }
	
	


}

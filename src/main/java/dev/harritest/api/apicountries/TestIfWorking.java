package dev.harritest.api.apicountries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestIfWorking {

	@RequestMapping(method = RequestMethod.GET,path="/say-hi")
	public String sayHi() {
		return "hi iam working <br> lets get started";
	
	}
	
}

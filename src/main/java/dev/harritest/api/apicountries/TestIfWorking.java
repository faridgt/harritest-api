package dev.harritest.api.apicountries;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestIfWorking {

	
	@GetMapping("/say-hi")
	public String sayHi() {
		return "hi iam working <br> lets get started";
	
	}
	
}

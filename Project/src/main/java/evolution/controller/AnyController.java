package evolution.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnyController {
	@Value("name")// You can inject the property directly from the properties file without @Bean.
	private String name;
	
	@GetMapping("/get")
	public String get() {
		return "Hello World";
	}
	
	@GetMapping("/properties")
	public String properties() {
		return name;
	}
}

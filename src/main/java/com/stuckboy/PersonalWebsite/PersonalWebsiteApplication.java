package com.stuckboy.PersonalWebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PersonalWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalWebsiteApplication.class, args);
	}

	@GetMapping("/")
	public String landingPage() {
		return """
					This is the default landing page for the website.
					
					Additional functionality to be implemented at a later date.
				""";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
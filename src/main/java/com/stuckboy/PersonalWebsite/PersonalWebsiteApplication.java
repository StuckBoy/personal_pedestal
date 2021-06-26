package com.stuckboy.PersonalWebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class PersonalWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalWebsiteApplication.class, args);
	}

	@RequestMapping(value ="/", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView landingPage() {
		return new ModelAndView("landingPage");
	}

	@RequestMapping(value = "/bio.html", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView bioPage() {
		return new ModelAndView("bio");
	}
}
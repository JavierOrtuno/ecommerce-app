package com.frogensource.mobile.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Welcome controller.
 */
@RestController
public class Welcome {

	/**
	 * Test Request Mapping.
	 * @return String
	 */
	@RequestMapping("/")
    public String test() {
        return "Greetings from Spring Boot!";
    }

}

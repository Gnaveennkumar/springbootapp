package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/greet")
	public String greet() {

		String str = "welcome to logging";

		return str;

	}

}

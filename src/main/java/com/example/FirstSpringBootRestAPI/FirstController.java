package com.example.FirstSpringBootRestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {

	@GetMapping("/wish")
	public String getmessage() {
		return "Good morning";
	}
	
	@GetMapping("/wish/{name}")
	public String getmessage(@PathVariable String name) {
		return "Good morning  "+name;
	}
}

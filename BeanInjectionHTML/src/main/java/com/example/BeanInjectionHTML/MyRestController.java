package com.example.BeanInjectionHTML;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name="/vc")
public class MyRestController {
	
	@GetMapping("/home")
	public String homepage() {
		return "RestController";
	}
	@GetMapping("/home1")
	public String homepage1() {
		return "RestController_1";
	}

}

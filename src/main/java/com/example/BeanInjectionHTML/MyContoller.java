package com.example.BeanInjectionHTML;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyContoller {
	
	@GetMapping("/demo")
	public String demo() {
		return "Inject HTML";
		
	}

}

package org.fatec.lib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String initialPage() {
		return "index";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		return "admin";
	}
	
}

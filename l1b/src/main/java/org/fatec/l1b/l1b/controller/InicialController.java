package org.fatec.l1b.l1b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicialController {
	
	@GetMapping("/")
	public String paginaInicial() {
		return "index";
	}
	
}

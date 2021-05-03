package org.fatec.lib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicoController {
		
	@GetMapping("/cadastrar-servicos")
	public String pageServico() {
		return "cadastrar-servicos";
	}

}

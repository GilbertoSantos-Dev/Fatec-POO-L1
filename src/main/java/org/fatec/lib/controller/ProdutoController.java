package org.fatec.lib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {
		
	@GetMapping("/cadastrar-produtos")
	public String pageProduto() {
		return "cadastrar-produtos";
	}

}

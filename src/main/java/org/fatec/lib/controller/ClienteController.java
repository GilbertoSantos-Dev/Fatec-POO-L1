package org.fatec.lib.controller;

import org.fatec.lib.model.Cliente;
import org.fatec.lib.model.Pessoa;
import org.fatec.lib.model.Telefone;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {
	
	@GetMapping("/cadastrar-clientes")
	public String pageCliente() {
		return "cadastrar-clientes";
	}
	
	@PostMapping("/cadastrar-cliente")
	public String pageClientes(Cliente c, Telefone d, Telefone t) {
		System.out.println(c.getPes()); 
		System.out.println(d.getDdd());
		System.out.println(t.getNumero());
		return "cadastrar-clientes";
	}
}

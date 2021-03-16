package com.segundaaplicacao.segundaaplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segunda")
public class SegundaController {
	
	@GetMapping
	public String objetivos() {
		return "Acabar projeto CTT, Entregar todas as ATV's da Generation, Estudar";
	}
}

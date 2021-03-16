package com.primeiraaplicacao.primeiraaplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/primeira")
public class PrimeiraController {
	
	@GetMapping
	public String bsm() {
		return "Persistência, Mentalidade de Crescimento, Responsabilidade Pessoal"; 
	}
}
   
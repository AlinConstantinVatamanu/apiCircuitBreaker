package com.nttdata.apicircuitbreaker.controller;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class IndexController {

	
	@Autowired
	private Saludo saludo;
	
	private Long contadorIntentos = 0L;
	
	@GetMapping("/saludo")
	public ResponseEntity<String> saludo() {
		return new ResponseEntity<String>(HttpStatus.OK).ok(saludo.mensajeSaludo());
	}
	
}

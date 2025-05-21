package com.capitani.dslist.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/henrique")
public class TestController {

	@GetMapping
	public ResponseEntity<String> retornaOla(){
		return ResponseEntity.ok().body("Olá Mundo!");
	}

}

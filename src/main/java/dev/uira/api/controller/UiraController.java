package dev.uira.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uira")
public class UiraController {
	
	@GetMapping
	private String ola() {
		return "Olá";
	}

}

package Emanuele.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class MainController {
	
	@GetMapping("/it")
	public String HomeIt() {
		return "benvenuto nella parte esplicativa di prenotazioni";
	};
	
	@GetMapping("/en")
	public String HomeEn() {
		return "welcome to the explanatory part of reservations";
	};
}

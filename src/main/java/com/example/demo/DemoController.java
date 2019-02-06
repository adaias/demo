package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class DemoController {

	@PostMapping
	public Model save(Model model){
		log.info("Guardando " + model.getNombre());
		return model;
	}
	
	@GetMapping
	public Model find(Model model){
		Model m = new Model();
		log.info("Hola " + model.getNombre());
		m.setNombre("Hola "+model.getNombre());
		return m;
	}

}


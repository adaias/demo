package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Log4j
public class DemoController {

	@PostMapping
	public Model save(Model model){
		return model;
	}
	
	@GetMapping
	public Model find(Model model){
		Model m = new Model();
		m.setNombre("Hola "+model.getNombre());
		return m;
	}

}


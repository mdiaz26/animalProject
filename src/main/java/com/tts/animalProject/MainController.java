package com.tts.animalProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	AnimalService animalService;
	
//	AnimalService animalService = new AnimalService();
	
	@GetMapping("/")
	public Animal index() {
		return animalService.createAnimal();
	}
}

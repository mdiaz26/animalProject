package com.tts.animalProject;

import org.springframework.stereotype.Service;

@Service
public class AnimalService {
	public Animal createAnimal() {
		Animal leo = new Animal("Leo", "Lion", 6);
		
		return leo;
	}
}

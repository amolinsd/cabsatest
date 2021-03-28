package es.cabsa.javadevelopers.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cabsa.javadevelopers.es.cabsa.javadevelopers.dto.AnimalDTO;
import es.cabsa.javadevelopers.model.Animals;
import es.cabsa.javadevelopers.model.Foods;
import es.cabsa.javadevelopers.services.JungleService;

@RestController
public class JungleController {

	private final JungleService service;

	public JungleController(JungleService service) {
		this.service = service;
	}

	@RequestMapping("/")
	public String index() {
		return "Welcome to the Jungle!";
	}

	@GetMapping("/animals")
	public List<Animals> obtainAnimals() {
		return service.obtainAnimals();
	}

	@GetMapping("/foods")
	public List<Foods> obtainFoods() {
		return service.obtainFoods();
	}

	@GetMapping("/dtos")
	public List<AnimalDTO> obtainDTOS() {
		return service.obtainDTOS();
	}

	@GetMapping("/animals/searcher/name/{name}")
	public AnimalDTO searchByName(@PathVariable String name) {
		return service.searchByName(name);

	}

	@GetMapping("/animals/searcher/food/{food}")
	public AnimalDTO searchByFood(@PathVariable String food) {
		return service.searchByFood(food);

	}

	@GetMapping("/animals/create/{id}/{name}/{legs}/{food}")
	public List<AnimalDTO> createAnimal(@PathVariable Integer id, @PathVariable String name, @PathVariable Integer legs,
			@PathVariable String food) {
		return service.createAnimal(id, name, legs, food);

	}

	@GetMapping("/animals/delete/{name}")
	public List<AnimalDTO> deleteAnimalByName(@PathVariable String name) {
		return service.deleteAnimalByName(name);

	}

	@GetMapping("/animals/modify/{id}/{name}/{legs}/{food}")
	public List<AnimalDTO> modifyAnimalById(@PathVariable Integer id, @PathVariable String name,
			@PathVariable Integer legs, @PathVariable String food) {
		return service.modifyAnimalById(id, name, legs, food);

	}
}

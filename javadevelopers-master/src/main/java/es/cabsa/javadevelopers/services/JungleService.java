package es.cabsa.javadevelopers.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import es.cabsa.javadevelopers.es.cabsa.javadevelopers.dto.AnimalDTO;
import es.cabsa.javadevelopers.model.Animals;
import es.cabsa.javadevelopers.model.Foods;

@Service
public class JungleService {

	public List<Animals> obtainAnimals() {

		List<Animals> animalsList = new ArrayList<>();

		animalsList.add(new Animals(0, "Rabbit", 4));
		animalsList.add(new Animals(1, "Bear", 4));
		animalsList.add(new Animals(2, "Deer", 4));
		animalsList.add(new Animals(3, "Snake", 0));
		animalsList.add(new Animals(4, "Cocodrile", 4));
		animalsList.add(new Animals(5, "Chicken", 2));
		animalsList.add(new Animals(6, "Spider", 8));

		return animalsList;

	}

	public List<Foods> obtainFoods() {

		List<Foods> foodsList = new ArrayList<>();

		foodsList.add(new Foods(0, "carrot"));
		foodsList.add(new Foods(1, "honey"));
		foodsList.add(new Foods(2, "leafs"));
		foodsList.add(new Foods(3, "insects"));
		foodsList.add(new Foods(4, "vermin"));
		foodsList.add(new Foods(5, "birdseed"));
		foodsList.add(new Foods(6, "mosquitos"));

		return foodsList;

	}

	public List<AnimalDTO> obtainDTOS() {
		List<Animals> animalsList = obtainAnimals();
		List<Foods> foodsList = obtainFoods();
		List<AnimalDTO> animalDTOList = new ArrayList<>();

		for (Animals animals : animalsList) {

			AnimalDTO animalDTO = new AnimalDTO();

			for (Foods foods : foodsList) {

				if (animals.getId().equals(foods.getId())) {
					animalDTO.setId(animals.getId());
					animalDTO.setName(animals.getName());
					animalDTO.setLegs(animals.getLegs());
					animalDTO.setFood(foods.getFood());
				}
			}

			animalDTOList.add(animalDTO);
		}

		return animalDTOList;

	}

	public AnimalDTO searchByName(String name) {

		List<AnimalDTO> animalsDTOList = obtainDTOS();

		AnimalDTO animalDTO = new AnimalDTO();

		for (AnimalDTO dtos : animalsDTOList) {
			if (name.equalsIgnoreCase(dtos.getName())) {
				animalDTO = dtos;
			}

		}

		return animalDTO;

	}

	public AnimalDTO searchByFood(String food) {

		List<AnimalDTO> animalsDTOList = obtainDTOS();

		AnimalDTO animalDTO = new AnimalDTO();

		for (AnimalDTO dtos : animalsDTOList) {
			if (food.equalsIgnoreCase(dtos.getFood())) {
				animalDTO = dtos;
			}

		}
		return animalDTO;

	}

	public List<AnimalDTO> createAnimal(Integer id, String name, Integer legs, String food) {

		List<AnimalDTO> animalsDTOList = obtainDTOS();

		AnimalDTO animalDTO = new AnimalDTO();
		animalDTO.setId(id);
		animalDTO.setName(name);
		animalDTO.setLegs(legs);
		animalDTO.setFood(food);

		animalsDTOList.add(animalDTO);

		return animalsDTOList;

	}

	public List<AnimalDTO> deleteAnimalByName(String name) {
		List<AnimalDTO> animalsDTOList = obtainDTOS();

		for (AnimalDTO dtos : animalsDTOList) {
			if (name.equalsIgnoreCase(dtos.getName())) {
				animalsDTOList.remove(dtos);
				break;
			}

		}

		return animalsDTOList;

	}

	public List<AnimalDTO> modifyAnimalById(Integer id, String name, Integer legs, String food) {
		List<AnimalDTO> animalsDTOList = obtainDTOS();

		for (AnimalDTO dtos : animalsDTOList) {
			if (id.equals(dtos.getId())) {
				dtos.setName(name);
				dtos.setLegs(legs);
				dtos.setFood(food);
			}

		}

		return animalsDTOList;

	}

}

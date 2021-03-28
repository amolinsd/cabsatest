package es.cabsa.javadevelopers.test;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import es.cabsa.javadevelopers.controller.JungleController;
import es.cabsa.javadevelopers.es.cabsa.javadevelopers.dto.AnimalDTO;
import es.cabsa.javadevelopers.services.JungleService;

public class JungleServiceTest {

	@InjectMocks
	JungleController jungleController = Mockito.mock(JungleController.class);
	
	@Mock
	private JungleService jungleService;

	@Test
	public void searchByNameTest() {

		String request = new String();
		AnimalDTO response = new AnimalDTO();

		when(jungleController.searchByName(request)).thenReturn(response);

	}

	@Test
	public void createAnimalTest() {

		String requestName = "Cookies Monster";
		String requestFood = "Hamburguer";
		Integer requestId = 10;
		Integer requestLegs = 10;
		List<AnimalDTO> response = new ArrayList<>();

		when(jungleController.createAnimal(requestId, requestName, requestLegs, requestFood)).thenReturn(response);

	}

}

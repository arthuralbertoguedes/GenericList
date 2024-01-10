package br.com.agtec.GenericList;

import br.com.agtec.GenericList.model.Car;
import br.com.agtec.GenericList.service.GenericListService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericListServiceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(GenericListServiceApplication.class, args);
		
		List<String> list1 = new ArrayList<>(List.of("Heitor", "Arthur", "Agtec", "Soluções"));
		List<String> list2 = new ArrayList<>(List.of("Heitor", "Arthur", "Agtec", "Soluções", "Claúdio", "Heitor", "Rojas"));
		
		List<Car> cars1 = new ArrayList<>();
		cars1.add(new Car(1L, "Ford", "Green"));
		cars1.add(new Car(2L, "Fusion", "Black"));
		cars1.add(new Car(3L, "Ford", "Red"));
		cars1.add(new Car(1L, "Ford", "Green"));

		
		List<Car> cars2 = new ArrayList<>();
		cars2.add( new Car(1L, "Volks", "Green"));
		cars2.add( new Car(5L, "Volks", "Gray"));
		cars2.add( new Car(4L, "Ford", "Black"));

		GenericListService genericListService = new GenericListService();
		
		System.out.println(genericListService.joinLists(cars1, cars2));
		System.out.println(genericListService.joinLists(list1, list2));
	}

}

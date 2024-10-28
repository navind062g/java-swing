package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP03Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		List<Integer> squareNumbers = doubleList(numbers);
		
		System.out.println(squareNumbers);
		
		//even numbers only
		List<Integer> evenNumbersOnly = numbers.stream()
				.filter((number) -> (number%2==0))
				.collect(Collectors.toList());
		
		System.out.println(evenNumbersOnly);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API", 
				"Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		//Create a List with lengths of all course titles.
		List<Integer> courseTitlesLenList = courses.stream()
				.map((str) -> (str.length()))
				.collect(Collectors.toList());
		
		System.out.println(courseTitlesLenList);
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		return numbers.stream()
				.map((number) -> (number*number))
				.collect(Collectors.toList())
				;
	}
	
	

}

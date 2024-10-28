package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 15, 6, 4, 8, 9, 18, 19, 10, 2);
		printAlltheNumbersInStructure(List.of(12, 15, 6, 4, 8, 9, 18, 19, 10, 2));

		// print only odd numbers in the list
		printAllTheOddNumbersInTheList(List.of(12, 15, 6, 4, 8, 9, 18, 19, 10, 2));

		// print all the courses individually
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		printCourses(courses);

		printCoursesContainingSpring(courses);
		
		printCoursesWithLengthFour(courses);
		
		//Print the cubes of odd numbers
		printCubesOfOddNumbers(numbers);
		
		//Print the number of characters in each course name
		printNumberOfCharacters(courses);

	}

	private static void printNumberOfCharacters(List<String> courses) {
		courses.stream()
			.forEach(course -> System.out.println("Number of characters in Course: "+ course + " are " + course.length()));
	}

	private static void printCubesOfOddNumbers(List<Integer> numbers) {
		numbers.stream()
		.filter((number) -> (number % 2 == 1))
		.map(number -> (number*number*number))
		.forEach(System.out::println);
	}

	private static void printCoursesWithLengthFour(List<String> courses) {
		System.out.println("======Printing Courses Containing Four Letters=====");
		
		courses.stream()
		.filter(course -> (course.length() >=  4))
		.forEach(System.out::println);
	}

	private static void printCoursesContainingSpring(List<String> courses) {
		
		System.out.println("======Printing Courses Containing Spring=====");
		
		courses.stream()
		.filter(course -> (course.contains("Spring")))
		.forEach(System.out::println);
	}

	private static void printCourses(List<String> courses) {
		System.out.println("======Printing Courses =====");
		courses.stream().forEach(System.out::println);
	}

	private static void printAllTheOddNumbersInTheList(List<Integer> numbers) {
		numbers.stream().filter(number -> (number % 2 == 1)).forEach(System.out::println);
	}

	/*
	 * private static boolean isEven(int number) { return (number % 2) == 0; }
	 */

	private static void printAlltheNumbersInStructure(List<Integer> numbers) {
		numbers.stream().filter((number) -> ((number % 2) == 0)).forEach(System.out::println);
	}

	/*
	 * private static void printNumber(int number) {
	 * System.out.println("Number: "+number); }
	 */
}

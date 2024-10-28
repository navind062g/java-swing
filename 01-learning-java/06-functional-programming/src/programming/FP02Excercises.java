package programming;

import java.util.List;

public class FP02Excercises {
	
	public static void main(String[] args) {
		/**
		 * 
		 * 
		Exercise 7
		Square every number in a list and find the sum of squares
		
		Exercise 8
		Cube every number in a list and find the sum of cubes
		
		Exercise 9
		Find Sum of Odd Numbers in a list
		 * 
		 */
		
		List<Integer> intList = List.of(12, 15, 6, 8, 9, 3, 4, 10, 7, 1, 5);
		
		//Square every number in a list and find the sum of squares
		printSumOfSquares(intList);
		
		printSumOfSquaresInStructuredFormat(intList);
		
		//Cube every number in a list and find the sum of cubes
		printSumOfCubes(intList);
		
		//Find Sum of Odd Numbers in a list
		printSumOfOddNumbers(intList);
		
	}

	private static void printSumOfOddNumbers(List<Integer> intList) {
		int sumOfOddNumbers = intList.stream()
				.filter((number) -> (number % 2 == 1))
				.reduce(0, Integer::sum);
		
		System.out.println("Sum of the odd numbers is: "+ sumOfOddNumbers);
	}

	private static void printSumOfCubes(List<Integer> intList) {
		int sumOfCubes = intList.stream()
				.map((number) -> (number*number*number))
				.reduce(0, Integer::sum);
		
		System.out.println("Sum of the cubes is: "+ sumOfCubes);
	}

	private static void printSumOfSquaresInStructuredFormat(List<Integer> intList) {
		int sum = 0;
		for(int number: intList) {
			sum += (number*number*number);
		}
		System.out.println("Sum of the numbers in traditional format: "+ sum);
	}

	private static void printSumOfSquares(List<Integer> intList) {
		
		int sumOfSquares = 
				intList.stream()
				.map(number -> (number*number))
				.reduce(0, (aggregate, nextNumber) -> (aggregate + nextNumber));
		
		System.out.println("Sum of the squares: "+sumOfSquares);
	}
}
